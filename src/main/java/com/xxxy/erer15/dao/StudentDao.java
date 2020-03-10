package com.xxxy.erer15.dao;

import com.xxxy.erer15.model.Student;
import com.xxxy.erer15.model.SysUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * StudentDao
 *
 * @author erer
 * @date 2020/3/9
 */
public interface StudentDao {


    @Select("select * from student t where t.username = #{username}")
    SysUser getStudent(String username);

    @Select("select count(*) from student t ")
    Long countAllStudnets();

    @Select("select * from student t order by t.id limit #{startPosition},#{limit}")
    List<Student> getAllStudnetByPage(@Param("startPosition") Integer startPosition, @Param("limit") Integer limit);

}
