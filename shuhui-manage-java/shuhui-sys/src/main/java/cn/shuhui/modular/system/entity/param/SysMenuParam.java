package cn.shuhui.modular.system.entity.param;

import cn.shuhui.entity.BasicEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("菜单param")
@Data
public class SysMenuParam extends BasicEntity {

    @ApiModelProperty("父id")
    private Long parentId;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("类型")
    private Long type;

    @ApiModelProperty("路径")
    private String path;

    @ApiModelProperty("组件")
    private String component;

    @ApiModelProperty("图标")
    private String icon;

    @ApiModelProperty("排序码")
    private Integer sortCode;


}
