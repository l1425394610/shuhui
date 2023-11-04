package cn.shuhui.enums;

import lombok.Data;

/**
 * @author luyingjian
 * @date 2023/11/1
 */
public enum StatusEnum {

    ENABLED("启用", 0),
    DISABLED("禁用", 1),
    DELETED("删除", 2);


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
