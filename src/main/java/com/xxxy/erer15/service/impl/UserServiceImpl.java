package com.xxxy.erer15.service.impl;


import com.xxxy.erer15.base.result.Results;
import com.xxxy.erer15.dao.SysRolrUserDao;
import com.xxxy.erer15.dao.UserDao;
import com.xxxy.erer15.model.SysRoleUser;
import com.xxxy.erer15.model.SysUser;
import com.xxxy.erer15.service.ImpUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * UserServiceImpl
 *
 * @author erer
 * @date 2020/2/29
 */
@Service
@Transactional//设置事务级别为默认的: 读写提交:一个事务只能读取另一个已经提交的数据.不能读取未提交的数据.只能用于public方法
public class UserServiceImpl implements ImpUserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private SysRolrUserDao sysRolrUserDao;
    @Override
    public SysUser getUser(String username) {
        return userDao.getUser(username);
    }
    @Override
    public Results<SysUser> getAllUsersByPage(Integer offSet, Integer limit) {
        return Results.success(userDao.countAllUser().intValue(),userDao.getAllUsersByPage(offSet,limit));
    }

    @Override
    public Results<SysUser> sava(SysUser sysUser, Integer roleId) {
        if (roleId != null){
            userDao.save(sysUser);
            SysRoleUser sysRoleUser = new SysRoleUser();
            sysRoleUser.setRoleId(roleId);
            sysRoleUser.setUserId(sysUser.getStatus());
            sysRolrUserDao.save(sysRoleUser);
            return Results.success();
            //user
            //rouId
            }
            return Results.failure();

    }

    @Override
    public SysUser getUserByPhone(String telephone) {
        return userDao.getUserByphone(telephone);
    }

    @Override
    public SysUser getUserById(Long id) {
        return userDao.getUserById(id);
    }


}
