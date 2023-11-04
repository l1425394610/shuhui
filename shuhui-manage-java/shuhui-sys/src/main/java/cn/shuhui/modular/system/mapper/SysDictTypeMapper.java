package cn.shuhui.modular.system.mapper;

import cn.shuhui.modular.system.entity.SysDictType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
public interface SysDictTypeMapper extends BaseMapper<SysDictType> {

    Page<SysDictType> page(@Param("page") Page page);

}
