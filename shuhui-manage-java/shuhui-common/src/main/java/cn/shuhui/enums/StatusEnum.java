package cn.shuhui.enums;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @author luyingjian
 * @date 2023/11/1
 */
@ApiModel("状态枚举")
public enum StatusEnum {

    ENABLED("启用", 1),
    DISABLED("禁用", 2),
    DELETED("删除", 3);


    private String text;
    private Integer code;

    StatusEnum(String text, Integer code) {
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
