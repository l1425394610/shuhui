package cn.shuhui.modular.system.controller;


import cn.hutool.core.lang.tree.Tree;
import cn.shuhui.entity.ResponseData;
import cn.shuhui.modular.system.entity.SysDictType;
import cn.shuhui.modular.system.entity.SysMenu;
import cn.shuhui.modular.system.entity.param.SysDictTypeParam;
import cn.shuhui.modular.system.entity.param.SysMenuParam;
import cn.shuhui.modular.system.service.SysDictTypeService;
import cn.shuhui.modular.system.service.SysMenuService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "菜单接口")
@RestController
@RequestMapping("/sysMenu")
public class SysMenuController {

    @Autowired
    private SysDictTypeService dictTypeService;

    @Autowired
    private SysMenuService sysMenuService;


    @ApiOperation("分页")
    @GetMapping("/page")
    public ResponseData<Page<SysDictType>> page(SysDictTypeParam sysDictTypeParam) {
        return ResponseData.success(dictTypeService.page(sysDictTypeParam));
    }

    @ApiOperation("树")
    @GetMapping("/tree")
    public ResponseData<List<Tree<Long>>> tree(SysMenuParam sysMenuParam) {
        return ResponseData.success(sysMenuService.tree());
    }

    @ApiOperation("新增")
    @PostMapping("/add")
    public ResponseData<Boolean> add(@RequestBody SysMenuParam sysMenuParam) {
        return ResponseData.success(sysMenuService.add(sysMenuParam));
    }

    @ApiOperation("编辑")
    @PostMapping("/edit")
    public ResponseData<Boolean> edit() {
        return ResponseData.success();
    }

    @ApiOperation("删除")
    @PostMapping("/delete")
    public ResponseData<Boolean> delete() {
        return ResponseData.success();
    }
}
