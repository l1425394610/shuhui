package cn.shuhui.modular.system.entity;

import cn.shuhui.entity.BasicEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@ApiModel("角色实体类")
@TableName("sys_role")
@Data
public class SysRole extends BasicEntity {

  @ApiModelProperty("名称")
  private String name;

  @ApiModelProperty("编码")
  private String code;


}
