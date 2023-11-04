package cn.shuhui.modular.system.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import cn.hutool.core.util.ObjectUtil;
import cn.shuhui.enums.SqlAffectedRowsEnum;
import cn.shuhui.enums.StatusEnum;
import cn.shuhui.factory.PageFactory;
import cn.shuhui.modular.system.entity.SysDictData;
import cn.shuhui.modular.system.entity.param.SysDictDataParam;
import cn.shuhui.modular.system.mapper.SysDictDataMapper;
import cn.shuhui.modular.system.service.SysDictDataService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class SysDictDataServiceImpl extends ServiceImpl<SysDictDataMapper, SysDictData> implements SysDictDataService {
    @Override
    public Page<SysDictData> page(SysDictDataParam sysDictDataParam) {
        LambdaQueryWrapper<SysDictData> queryWrapper = new LambdaQueryWrapper<>();
        return baseMapper.page(PageFactory.PageData());
    }

    @Override
    public boolean add(SysDictDataParam sysDictDataParam) {
        SysDictData sysDictData = new SysDictData();
        BeanUtil.copyProperties(sysDictDataParam, sysDictData, CopyOptions.create().setIgnoreCase(true));
        return ObjectUtil.equal(SqlAffectedRowsEnum.ONE.getTotal(), baseMapper.insert(sysDictData));

    }

    @Override
    public boolean edit(SysDictDataParam sysDictDataParam) {
        SysDictData sysDictData = new SysDictData();
        BeanUtil.copyProperties(sysDictDataParam, sysDictData, CopyOptions.create().setIgnoreCase(true));
        return ObjectUtil.equal(SqlAffectedRowsEnum.ONE.getTotal(), baseMapper.updateById(sysDictData));
    }

    @Override
    public boolean delete(SysDictDataParam sysDictDataParam) {
        SysDictData sysDictData = new SysDictData();
        BeanUtil.copyProperties(sysDictDataParam, sysDictData, CopyOptions.create().setIgnoreCase(true));
        sysDictData.setStatus(StatusEnum.DELETED.getCode());
        return ObjectUtil.equal(SqlAffectedRowsEnum.ONE.getTotal(), baseMapper.updateById(sysDictData));
    }

    @Override
    public boolean disable(SysDictDataParam sysDictDataParam) {
        SysDictData sysDictData = new SysDictData();
        BeanUtil.copyProperties(sysDictDataParam, sysDictData, CopyOptions.create().setIgnoreCase(true));
        sysDictData.setStatus(StatusEnum.DISABLED.getCode());
        return ObjectUtil.equal(SqlAffectedRowsEnum.ONE.getTotal(), baseMapper.updateById(sysDictData));
    }
}
