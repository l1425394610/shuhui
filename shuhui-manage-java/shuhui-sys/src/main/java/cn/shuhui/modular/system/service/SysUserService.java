package cn.shuhui.modular.system.service;


import cn.shuhui.modular.system.entity.SysUser;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

public interface SysUserService extends IService<SysUser> {


    Page<SysUser> page();

}
