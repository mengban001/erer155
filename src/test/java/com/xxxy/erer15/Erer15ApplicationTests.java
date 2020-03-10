package com.xxxy.erer15;

import com.xxxy.erer15.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
 class Erer15ApplicationTests {

    @Resource
    UserDao dao ;
    @Test
    public void contextLoads() {
//        SysUser user = new SysUser();
//        user.setUsername("erer007");
//        user.setPassword(new BCryptPasswordEncoder().encode("123123"));
//        user.setStatus(1);
//        dao.updateUser(user);
//        dao.changePassword(new Long(1), new BCryptPasswordEncoder().encode("admin"));
//
//    }
    }
}
