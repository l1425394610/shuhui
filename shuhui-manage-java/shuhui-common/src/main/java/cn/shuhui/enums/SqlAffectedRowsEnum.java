package cn.shuhui.enums;

import io.swagger.annotations.ApiModel;

/**
 * @author luyingjian
 * @date 2023/11/4
 */
@ApiModel("sql语句执行影响行数")
public enum SqlAffectedRowsEnum {

    ONE(1);


    private Integer total;

    SqlAffectedRowsEnum(Integer total){
        this.total = total;
    }

    public Integer getTotal(){
        return total;
    }

}
