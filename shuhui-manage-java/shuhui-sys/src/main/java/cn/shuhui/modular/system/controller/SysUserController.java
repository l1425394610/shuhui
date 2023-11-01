package cn.shuhui.modular.system.controller;


import cn.shuhui.modular.system.entity.SysUser;
import cn.shuhui.modular.system.service.SysUserService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Api("用户模块")
@RestController
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
