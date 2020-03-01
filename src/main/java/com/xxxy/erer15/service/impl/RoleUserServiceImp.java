package com.xxxy.erer15.service.impl;

import com.xxxy.erer15.base.result.Results;
import com.xxxy.erer15.dao.SysRolrUserDao;
import com.xxxy.erer15.model.SysRoleUser;
import com.xxxy.erer15.service.ImpRoleUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * RoleUserServiceImp
 *
 * @author erer
 * @date 2020/3/1
 */
@Service
public class RoleUserServiceImp implements ImpRoleUserService {
    @Autowired
    SysRolrUserDao sysRolrUserDao;
    @Override
    public Results getSysRoleUserByUserId(Integer userId) {
       SysRoleUser sysRoleUser = sysRolrUserDao.SysRoleUserByUserId(userId);
       if (sysRoleUser != null){
        return Results.success(sysRoleUser) ;
       }else {
           return Results.success();
       }

    }
}
