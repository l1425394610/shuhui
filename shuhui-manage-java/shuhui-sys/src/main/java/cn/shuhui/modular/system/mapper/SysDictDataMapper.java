package cn.shuhui.modular.system.mapper;

import cn.shuhui.modular.system.entity.SysDictData;
import cn.shuhui.modular.system.entity.SysDictType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysDictDataMapper extends BaseMapper<SysDictData> {

    Page<SysDictData> page(@Param("page") Page page);

}
