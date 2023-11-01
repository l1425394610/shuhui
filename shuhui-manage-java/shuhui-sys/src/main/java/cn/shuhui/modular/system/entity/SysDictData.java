package cn.shuhui.modular.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel("字典数据")
@TableName("sys_dict_data")
@Data
public class SysDictData {

  private Integer id;
  private Integer type;
  private String text;
  private Integer code;

}
