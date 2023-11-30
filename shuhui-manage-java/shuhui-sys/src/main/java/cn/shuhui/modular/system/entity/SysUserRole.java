package cn.shuhui.modular.system.entity;

import cn.shuhui.entity.BasicEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("用户-角色实体类")
@TableName("sys_user_role")
@Data
public class SysUserRole extends BasicEntity {

  @ApiModelProperty("用户id")
  private Long userId;
  @ApiModelProperty("角色id")
  private Long roleId;

}
