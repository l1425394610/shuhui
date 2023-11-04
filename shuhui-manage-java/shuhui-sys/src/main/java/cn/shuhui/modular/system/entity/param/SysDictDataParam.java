package cn.shuhui.modular.system.entity.param;

import cn.shuhui.entity.BasicEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author luyingjian
 * @date 2023/11/1
 */
@ApiModel(value = "数据字典Param")
@Data
public class SysDictDataParam extends BasicEntity {
    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("编码")
    private String code;

    @ApiModelProperty("排序吗")
    private Integer sortCode;

    @ApiModelProperty("描述")
    private String description;

    @ApiModelProperty("状态")
    private Integer status;
}
