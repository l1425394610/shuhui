package cn.shuhui.modular.system.service;


import cn.shuhui.modular.system.entity.SysDictType;
import cn.shuhui.modular.system.param.SysDictTypeParam;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface SysDictTypeService extends IService<SysDictType> {

    Page<SysDictType> page();

    boolean add(SysDictTypeParam sysDictTypeParam);

    boolean edit(SysDictTypeParam sysDictTypeParam);

    boolean delete(SysDictTypeParam sysDictTypeParam);


}
