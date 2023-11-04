package cn.shuhui.exception;

import cn.hutool.core.util.StrUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author luyingjian
 * @date 2023/11/4
 */
@Data
@ApiModel("公共异常类")
public class CommonException extends RuntimeException {

    @ApiModelProperty("状态码")
    private Integer code;

    @ApiModelProperty("信息")
    private String message;

    public CommonException() {
        this.code = 500;
        this.message = "服务器异常";
    }

    public CommonException(String message) {
        this.code = 500;
        this.message = message;
    }

}
