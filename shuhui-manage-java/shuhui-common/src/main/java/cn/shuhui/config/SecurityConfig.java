package cn.shuhui.config;


import org.mapstruct.BeanMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 新增security,授权的账户，后期查询数据库。
     * configure(AuthenticationManagerBuilder)用于通过允许AuthenticationProvider容易地添加来建立认证机制。
     * 也就是说用来记录账号，密码，角色信息。
     *
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {



        // 自定义登陆方式，实现UserDetailsService接口
        // auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
        auth.inMemoryAuthentication()
                .withUser("luyingjian")
                .password(new BCryptPasswordEncoder().encode("luyingjian"))
                .roles("user");

        // auth.inMemoryAuthentication()
        //         .passwordEncoder(new BCryptPasswordEncoder())
        //         .withUser("admin")
        //         .password(new BCryptPasswordEncoder().encode("admin"))
        //         .roles("admin");
        //
        // // Spring security 5.0中新增了多种加密方式,也改变了默认的密码格式。
        // // 在浏览器使用以上账户登陆会失败，因为上面存储的密码未进行加密，而对浏览器传过来的密码进行的加密再匹配
        // auth.inMemoryAuthentication()
        //         .passwordEncoder(new BCryptPasswordEncoder())
        //         .withUser("test")
        //         .password(new BCryptPasswordEncoder().encode("test"))
        //         .roles("test");

    }


    /**
     * 配置认证方式
     * configure(HttpSecurity)允许基于选择匹配在资源级配置基于网络的安全性。
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // authorizeRequests()针对http请求进行授权配置
        // permitAll()具有所有权限，可以匿名访问
        // anyRequest()任何请求，所有请求
        // authenticated()认证登陆
        // http.authorizeRequests()
        //         .antMatchers("/admin/**").permitAll()
        //         .anyRequest().authenticated();

        // loginProcessingUrl()指定登陆接口，过滤器
        // successHandler 登陆成功处理器
        // failureHandler 登陆失败处理器

        // 指定登陆界面后，必须指定登陆url
        // http.formLogin().loginPage("").loginProcessingUrl("/login")

        // 修改账号密码字段名
        // http.formLogin().passwordParameter("uname").passwordParameter("pwd");

        // 禁止 csrf 跨站请求保护
        // http.csrf().disable();
        http.csrf().disable().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.cors(Customizer.withDefaults());
        http.cors().disable();


        // 放行的资源写在前面
        http.authorizeRequests().antMatchers("/login","/public/**").permitAll().anyRequest().authenticated();
        // http.authorizeRequests().antMatchers("/admin/**").hasRole("admin");
        // http.authorizeRequests().antMatchers("/user/**").hasAnyRole("admin");

        http.formLogin()
                .and()
                .logout()
                .logoutUrl("/logout") // 指定注销登录url
                .invalidateHttpSession(true) // 会话失效
                .clearAuthentication(true) // 清除认证信息
                .logoutUrl("/logout.html")
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout1","GET"));
        http.formLogin()
                .loginProcessingUrl("/login")
                .successHandler(new AuthenticationSuccessHandler() {
                    @Override
                    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
                        System.out.println("login success");
                        httpServletResponse.getWriter().write("login success");
                    }
                }).failureHandler(new AuthenticationFailureHandler() {
                    @Override
                    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
                        System.out.println("login fail");
                        httpServletResponse.getWriter().write("login fail");
                    }
                });
        http.logout().logoutSuccessHandler(new LogoutSuccessHandler() {
            @Override
            public void onLogoutSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
                httpServletResponse.setContentType("application/json;character=UTF-8");
                httpServletResponse.getWriter().write("logout");
            }
        });
    }


    /**
     * configure(WebSecurity)用于影响全局安全性(配置资源，设置调试模式，通过实现自定义防火墙定义拒绝请求)的配置设置。
     * 一般用于配置全局的某些通用事物，例如静态资源等
     *
     * @param web
     * @throws Exception
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/test/**");
    }




    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    // @Bean
    // public static NoOpPasswordEncoder passwordEncoder() {
    //     return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    // }
}
