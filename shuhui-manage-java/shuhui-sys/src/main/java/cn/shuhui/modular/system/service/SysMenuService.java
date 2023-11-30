package cn.shuhui.modular.system.service;


import cn.hutool.core.lang.tree.Tree;
import cn.shuhui.modular.system.entity.SysMenu;
import cn.shuhui.modular.system.entity.SysUser;
import cn.shuhui.modular.system.entity.param.SysMenuParam;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface SysMenuService extends IService<SysMenu> {


    /**
     * 新增
     * @param sysMenuParam
     * @return
     */
    boolean add(SysMenuParam sysMenuParam);


    /**
     * 获取菜单集合
     */
    List<Tree<Long>> tree();


}
