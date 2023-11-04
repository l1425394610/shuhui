package cn.shuhui.modular.system.controller;


import cn.shuhui.entity.ResponseData;
import cn.shuhui.modular.system.entity.SysDictType;
import cn.shuhui.modular.system.entity.param.SysDictTypeParam;
import cn.shuhui.modular.system.service.SysDictTypeService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "数据字典接口")
@RestController
@RequestMapping("/sysDictData")
public class SysDictDataController {

    @Autowired
    private SysDictTypeService dictTypeService;


    @ApiOperation("分页")
    @GetMapping("/page")
    public ResponseData<Page<SysDictType>> page(SysDictTypeParam sysDictTypeParam) {
        return ResponseData.success(dictTypeService.page(sysDictTypeParam));
    }

    @ApiOperation("新增")
    @PostMapping("/add")
    public ResponseData add(@RequestBody SysDictTypeParam sysDictTypeParam) {
        return ResponseData.success(dictTypeService.add(sysDictTypeParam));
    }

    @ApiOperation("编辑")
    @PostMapping("/edit")
    public ResponseData edit() {
        return ResponseData.success();
    }

    @ApiOperation("删除")
    @GetMapping("/delete")
    public ResponseData delete() {
        return ResponseData.success();
    }
}
