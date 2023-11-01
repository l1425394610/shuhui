package cn.shuhui.modular.system.controller;


import cn.shuhui.entity.ResponseData;
import cn.shuhui.modular.system.entity.SysDictType;
import cn.shuhui.modular.system.service.SysDictTypeService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("数据字典")
@RestController
@RequestMapping("/sysDictType")
public class SysDictTypeController {

    @Autowired
    private SysDictTypeService dictTypeService;

    /**
     * 分页
     * @return
     */
    @GetMapping("/page")
    public ResponseData<Page<SysDictType>> page() {
        return ResponseData.success(dictTypeService.page());
    }

    /**
     * 新增
     * @return
     */
    @PostMapping("/add")
    public ResponseData add() {
        return ResponseData.success();
    }

    /**
     * 编辑
     * @return
     */
    @PostMapping("/edit")
    public ResponseData edit() {
        return ResponseData.success();
    }

    /**
     * 删除
     * @return
     */
    @GetMapping("/delete")
    public ResponseData delete() {
        return ResponseData.success();
    }
}
