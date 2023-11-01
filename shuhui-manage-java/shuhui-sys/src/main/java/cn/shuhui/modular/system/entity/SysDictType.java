package cn.shuhui.modular.system.entity;

import cn.shuhui.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel("字典类型")
@TableName("sys_dict_type")
@Data
public class SysDictType extends BaseEntity {

  /**
   * id
   */
  private Integer id;

  /**
   * 名称
   */
  private String name;

  /**
   * 编码
   */
  private String code;

  /**
   * 排序吗
   */
  private Integer sortCode;

  /**
   * 描述
   */
  private String description;


  /**
   * 状态
   */
  private Integer status;




}
