package cn.shuhui.modular.user.service.impl;

import cn.shuhui.factory.PageFactory;
import cn.shuhui.modular.user.entity.SysUser;
import cn.shuhui.modular.user.mapper.SysUserMapper;
import cn.shuhui.modular.user.service.SysUserService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {


    @Override
    public Page<SysUser> page() {
        LambdaQueryWrapper<SysUser> queryWrapper = new LambdaQueryWrapper<>();
        Page page = PageFactory.getPageData();
        page.setSearchCount(false);
        return getBaseMapper().selectPage(page, queryWrapper);
    }
}
