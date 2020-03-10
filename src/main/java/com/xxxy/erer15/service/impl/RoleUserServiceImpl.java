package com.xxxy.erer15.service.impl;

import com.xxxy.erer15.base.result.Results;
import com.xxxy.erer15.dao.RoleUserDao;
import com.xxxy.erer15.model.SysRoleUser;
import com.xxxy.erer15.service.RoleUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleUserServiceImpl implements RoleUserService {
    @Autowired
    private RoleUserDao roleUserDao;

    @Override
    public Results getSysRoleUserByUserId(Integer userId) {
        SysRoleUser sysRoleUser = roleUserDao.getSysRoleUserByUserId(userId);
        if(sysRoleUser != null){
            return Results.success(sysRoleUser);
        }else{
            return Results.success();
        }
    }
}
