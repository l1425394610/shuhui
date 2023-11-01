package cn.shuhui.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author luyingjian
 * @date 2023/11/1
 */
@Data
public class BaseEntity {
    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private Integer createUser;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 修改人
     */
    private Integer updateUser;

}
