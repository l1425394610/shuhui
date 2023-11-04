package cn.shuhui.modular.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("字典数据")
@TableName("sys_dict_data")
@Data
public class SysDictData {


  @ApiModelProperty("类型id")
  private Integer typeId;

  @ApiModelProperty("名称")
  private String text;

  @ApiModelProperty("编码")
  private Integer code;

  @ApiModelProperty("排序吗")
  private Integer sortCode;

  @ApiModelProperty("描述")
  private String description;

  @ApiModelProperty("状态")
  private Integer status;

}
