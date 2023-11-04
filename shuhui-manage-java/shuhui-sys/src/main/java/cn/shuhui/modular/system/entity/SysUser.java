package cn.shuhui.modular.system.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
@ApiModel(value = "用户类",description = "用户实体类")
@TableName("sys_user")
@Data
public class SysUser {


    @ApiModelProperty("账号")
    private String account;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("头像")
    private String avatar;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("出生日期")
    private Date birth;

    @ApiModelProperty("创建时间")
    private Date createTime;

}
