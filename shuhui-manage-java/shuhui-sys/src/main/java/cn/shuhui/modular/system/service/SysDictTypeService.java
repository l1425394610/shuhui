package cn.shuhui.modular.system.service;


import cn.shuhui.modular.system.entity.SysDictType;
import cn.shuhui.modular.system.entity.param.SysDictTypeParam;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;


public interface SysDictTypeService extends IService<SysDictType> {

    /**
     * 分页
     * @return
     */
    Page<SysDictType> page(SysDictTypeParam sysDictTypeParam);

    /**
     * 添加
     * @param sysDictTypeParam
     * @return
     */
    boolean add(SysDictTypeParam sysDictTypeParam);

    /**
     * 编辑
     * @param sysDictTypeParam
     * @return
     */
    boolean edit(SysDictTypeParam sysDictTypeParam);

    /**
     * 删除
     * @param sysDictTypeParam
     * @return
     */
    boolean delete(SysDictTypeParam sysDictTypeParam);

    /**
     * 禁用
     * @param sysDictTypeParam
     * @return
     */
    boolean disable(SysDictTypeParam sysDictTypeParam);



}
