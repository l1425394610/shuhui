package cn.shuhui.modular.system.mapper;

import cn.shuhui.modular.system.entity.SysMenu;
import cn.shuhui.modular.system.entity.SysUser;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface SysMenuMapper extends BaseMapper<SysMenu> {


    Page<SysMenu> page(@Param("page") Page page);




}
