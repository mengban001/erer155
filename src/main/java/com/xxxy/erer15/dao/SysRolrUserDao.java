package com.xxxy.erer15.dao;

import com.xxxy.erer15.model.SysRoleUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * SysRolrUser
 *
 * @author erer
 * @date 2020/3/1
 */
@Mapper
public interface SysRolrUserDao {
    @Insert("insert into sys_role_user(userId,roleId) values(#{userId},#{roleId}) ")
    void save(SysRoleUser sysRoleUser);
    @Select("select * from sys_role_user t where t.userId = #{userId}")
    SysRoleUser SysRoleUserByUserId(Integer userId);
}
