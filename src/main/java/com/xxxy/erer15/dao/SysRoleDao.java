package com.xxxy.erer15.dao;

import com.xxxy.erer15.model.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * SysRole
 *
 * @author erer
 * @date 2020/3/1
 */
@Mapper
public interface SysRoleDao {

    @Select("select * from sys_role t")
    List<SysRole> getAllRoles();
}
