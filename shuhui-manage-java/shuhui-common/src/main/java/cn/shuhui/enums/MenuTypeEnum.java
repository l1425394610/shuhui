package cn.shuhui.enums;

import io.swagger.annotations.ApiModel;

/**
 * @author luyingjian
 * @date 2023/11/5
 */
@ApiModel("菜单类型枚举")
public enum MenuTypeEnum {

    BUTTON("按钮",0),
    MENU("菜单",1),
    DIRECTORY("目录",2);

    private String text;
    private Integer code;

    MenuTypeEnum(String text, Integer code) {
        this.text = text;
        this.code = code;
    }

    public Integer getCode(){
        return code;
    }

    public String getText(){
        return text;
    }
}
