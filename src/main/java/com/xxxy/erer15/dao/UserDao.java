package com.xxxy.erer15.dao;

import com.xxxy.erer15.model.SysUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {

    /**
     * name查询
     * @param username
     * @return
     */
    @Select("select * from sys_user t where t.username = #{username}")
    SysUser getUser(String username);

    /**
     * id查询
     * @param id
     * @return
     */
    @Select("select * from sys_user t where t.id = #{id}")
    SysUser getById(Long id);
    /**
     * 新增
     * @param user
     * @return 自增主键 keyProperty
     */

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into sys_user(username, password, nickname, headImgUrl, phone, telephone, email, birthday, sex, status, createTime, updateTime) values(#{username}, #{password}, #{nickname}, #{headImgUrl}, #{phone}, #{telephone}, #{email}, #{birthday}, #{sex}, #{status}, now(), now())")
    int save(SysUser user);




    /**
     * 删除
     * @param id
     * @return
     */
    @Delete("delete from sys_user where id = #{id}")
    int deleteUser(Long id);

    /**
     * (通过配置文件)
     * 更新
     * @param user
     * @return
     */
    int updateUser(SysUser user);

    /**
     * 统计数量
     * @return long
     */
    @Select("select count(*) from sys_user t ")
    Long countAllUser();

    /**
     * 分页排序
     * @return
     */
    @Select("select * from sys_user t order by  t.id limit #{starPosition} , #{limit}")
    List<SysUser> getAllUsersByPage(@Param("starPosition")Integer starPosition,@Param("limit")Integer limit);
    @Select("select * from sys_user t where t.telephone = #{telephone}")
    SysUser getUserByphone(String telephone);
    @Select("select * from sys_user t where t.id = #{id}")
    SysUser getUserById(Long id);
}
