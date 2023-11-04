package cn.shuhui.modular.system.service;


import cn.shuhui.modular.system.entity.SysDictData;
import cn.shuhui.modular.system.entity.SysDictType;
import cn.shuhui.modular.system.entity.param.SysDictDataParam;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;


public interface SysDictDataService extends IService<SysDictData> {

    /**
     * 分页
     * @return
     */
    Page<SysDictData> page(SysDictDataParam sysDictDataParam);

    /**
     * 添加
     * @param sysDictDataParam
     * @return
     */
    boolean add(SysDictDataParam sysDictDataParam);

    /**
     * 编辑
     * @param sysDictDataParam
     * @return
     */
    boolean edit(SysDictDataParam sysDictDataParam);

    /**
     * 删除
     * @param sysDictDataParam
     * @return
     */
    boolean delete(SysDictDataParam sysDictDataParam);

    /**
     * 禁用
     * @param sysDictDataParam
     * @return
     */
    boolean disable(SysDictDataParam sysDictDataParam);



}
