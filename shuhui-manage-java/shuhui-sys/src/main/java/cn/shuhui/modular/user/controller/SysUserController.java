package cn.shuhui.modular.user.controller;


import cn.shuhui.modular.user.entity.SysUser;
import cn.shuhui.modular.user.service.SysUserService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("用户模块")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/test/page")
    public Page<SysUser> page(){
        return sysUserService.page();
    }

    @GetMapping("/admin/page")
    public Page<SysUser> adminPage(){
        return sysUserService.page();
    }


    // @PostMapping("/login")
    // public String login(@RequestBody SysUser sysUser){
    //     if (sysUser.getAccount().equals("admin") && sysUser.getPassword().equals("admin")){
    //         return "success";
    //     }else {
    //         return "fail";
    //     }
    // }

    @GetMapping("/admin/test")
    public String adminTest(){
        return "admin--test";
    }

    @GetMapping("/user/test")
    public String userTest(){
        return "user--test";
    }

    @GetMapping("/public/test")
    public String publicTest(){
        return "public--test";
    }

    @GetMapping("/public/hello")
    public String publicHello(){
        return "public--hello";
    }

}
