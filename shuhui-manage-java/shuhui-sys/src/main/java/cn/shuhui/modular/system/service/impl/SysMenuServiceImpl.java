package cn.shuhui.modular.system.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeNode;
import cn.hutool.core.lang.tree.TreeUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.json.JSONUtil;
import cn.shuhui.enums.SqlAffectedRowsEnum;
import cn.shuhui.enums.StatusEnum;
import cn.shuhui.modular.system.entity.SysMenu;
import cn.shuhui.modular.system.entity.param.SysMenuParam;
import cn.shuhui.modular.system.mapper.SysMenuMapper;
import cn.shuhui.modular.system.service.SysMenuService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author luyingjian
 * @date 2023/11/5
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService {

    @Override
    public boolean add(SysMenuParam sysMenuParam) {
        SysMenu sysMenu = new SysMenu();
        BeanUtil.copyProperties(sysMenuParam, sysMenu, CopyOptions.create().setIgnoreCase(true));
        return ObjectUtil.equal(SqlAffectedRowsEnum.ONE.getTotal(), baseMapper.insert(sysMenu));
    }

    @Override
    public List<Tree<Long>> tree() {
        LambdaQueryWrapper<SysMenu> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(SysMenu::getStatus, StatusEnum.ENABLED.getCode());
        List<SysMenu> list = baseMapper.selectList(queryWrapper);
        List<TreeNode<Long>> treeNodeList = list.stream().map(sysMenu ->
                new TreeNode<>(sysMenu.getId(), sysMenu.getParentId(), sysMenu.getTitle(), sysMenu.getSortCode())
                        .setExtra(JSONUtil.parseObj(sysMenu))
        ).collect(Collectors.toList());
        return TreeUtil.build(treeNodeList, 0L);
    }
}
