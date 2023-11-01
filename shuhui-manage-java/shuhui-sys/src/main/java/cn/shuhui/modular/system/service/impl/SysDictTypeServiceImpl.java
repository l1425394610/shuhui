package cn.shuhui.modular.system.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import cn.hutool.db.PageResult;
import cn.shuhui.factory.PageFactory;
import cn.shuhui.modular.system.entity.SysDictType;
import cn.shuhui.modular.system.mapper.SysDictTypeMapper;
import cn.shuhui.modular.system.param.SysDictTypeParam;
import cn.shuhui.modular.system.service.SysDictTypeService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysDictTypeServiceImpl extends ServiceImpl<SysDictTypeMapper, SysDictType> implements SysDictTypeService {
    @Override
    public Page<SysDictType> page() {
        LambdaQueryWrapper<SysDictType> queryWrapper = new LambdaQueryWrapper<>();
        return this.page(PageFactory.getPageData(), queryWrapper);
    }

    @Override
    public boolean add(SysDictTypeParam sysDictTypeParam) {
        SysDictType sysDictType = new SysDictType();
        BeanUtil.copyProperties(sysDictTypeParam,sysDictType, CopyOptions.create().setIgnoreCase(true));
        return this.baseMapper.insert(sysDictType) == 1;
    }

    @Override
    public boolean edit(SysDictTypeParam sysDictTypeParam) {
        return false;
    }

    @Override
    public boolean delete(SysDictTypeParam sysDictTypeParam) {
        return false;
    }
}
