package cn.shuhui.modular.system.service.impl;

import cn.shuhui.factory.PageFactory;
import cn.shuhui.modular.system.entity.SysUser;
import cn.shuhui.modular.system.mapper.SysUserMapper;
import cn.shuhui.modular.system.service.SysUserService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {


    @Override
    public Page<SysUser> page() {
        LambdaQueryWrapper<SysUser> queryWrapper = new LambdaQueryWrapper<>();
        return getBaseMapper().selectPage(PageFactory.PageData(), queryWrapper);
    }
}
