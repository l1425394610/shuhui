package cn.shuhui.modular.system.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import cn.hutool.core.util.ObjectUtil;
import cn.shuhui.enums.SqlAffectedRowsEnum;
import cn.shuhui.enums.StatusEnum;
import cn.shuhui.factory.PageFactory;
import cn.shuhui.modular.system.entity.SysDictType;
import cn.shuhui.modular.system.mapper.SysDictTypeMapper;
import cn.shuhui.modular.system.entity.param.SysDictTypeParam;
import cn.shuhui.modular.system.service.SysDictTypeService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class SysDictTypeServiceImpl extends ServiceImpl<SysDictTypeMapper, SysDictType> implements SysDictTypeService {
    @Override
    public Page<SysDictType> page(SysDictTypeParam sysDictTypeParam) {
        LambdaQueryWrapper<SysDictType> queryWrapper = new LambdaQueryWrapper<>();
        return baseMapper.page(PageFactory.PageData());
    }

    @Override
    public boolean add(SysDictTypeParam sysDictTypeParam) {
        SysDictType sysDictType = new SysDictType();
        BeanUtil.copyProperties(sysDictTypeParam, sysDictType, CopyOptions.create().setIgnoreCase(true));
        return ObjectUtil.equal(SqlAffectedRowsEnum.ONE.getTotal(), baseMapper.insert(sysDictType));

    }

    @Override
    public boolean edit(SysDictTypeParam sysDictTypeParam) {
        SysDictType sysDictType = new SysDictType();
        BeanUtil.copyProperties(sysDictTypeParam, sysDictType, CopyOptions.create().setIgnoreCase(true));
        return ObjectUtil.equal(SqlAffectedRowsEnum.ONE.getTotal(), baseMapper.updateById(sysDictType));
    }

    @Override
    public boolean delete(SysDictTypeParam sysDictTypeParam) {
        SysDictType sysDictType = new SysDictType();
        BeanUtil.copyProperties(sysDictTypeParam, sysDictType, CopyOptions.create().setIgnoreCase(true));
        sysDictType.setStatus(StatusEnum.DELETED.getCode());
        return ObjectUtil.equal(SqlAffectedRowsEnum.ONE.getTotal(), baseMapper.updateById(sysDictType));
    }

    @Override
    public boolean disable(SysDictTypeParam sysDictTypeParam) {
        SysDictType sysDictType = new SysDictType();
        BeanUtil.copyProperties(sysDictTypeParam, sysDictType, CopyOptions.create().setIgnoreCase(true));
        sysDictType.setStatus(StatusEnum.DISABLED.getCode());
        return ObjectUtil.equal(SqlAffectedRowsEnum.ONE.getTotal(), baseMapper.updateById(sysDictType));
    }
}
