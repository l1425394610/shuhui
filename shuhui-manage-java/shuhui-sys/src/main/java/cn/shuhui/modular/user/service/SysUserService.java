package cn.shuhui.modular.user.service;


import cn.shuhui.modular.user.entity.SysUser;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

public interface SysUserService extends IService<SysUser> {


    Page<SysUser> page();

}
