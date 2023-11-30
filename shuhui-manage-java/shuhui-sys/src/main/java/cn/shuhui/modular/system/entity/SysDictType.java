package cn.shuhui.modular.system.entity;

import cn.shuhui.entity.BasicEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "字典类型")
@TableName("sys_dict_type")
@Data
public class SysDictType extends BasicEntity {

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("编码")
    private String code;

    @ApiModelProperty("排序码")
    private Integer sortCode;

    @ApiModelProperty("描述")
    private String description;




}
