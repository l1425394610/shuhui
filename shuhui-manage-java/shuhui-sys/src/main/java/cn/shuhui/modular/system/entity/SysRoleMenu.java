package cn.shuhui.modular.system.entity;

import cn.shuhui.entity.BasicEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@ApiModel("角色-菜单实体类")
@TableName("sys_role_menu")
@Data
public class SysRoleMenu extends BasicEntity {

  @ApiModelProperty("菜单id")
  private Long menuId;

  @ApiModelProperty("角色id")
  private Long roleId;


}
