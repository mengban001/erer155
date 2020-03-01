package com.xxxy.erer15.service.impl;


import com.xxxy.erer15.base.result.Results;
import com.xxxy.erer15.dao.SysRoleDao;
import com.xxxy.erer15.model.SysRole;
import com.xxxy.erer15.service.ImpRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl
 *
 * @author erer
 * @date 2020/2/29
 */
@Service
public class RoleServiceImpl implements ImpRoleService {

    @Autowired
    private SysRoleDao sysRoleDao;
    @Override
    public Results<SysRole> getAllRoles() {
        return Results.success(500,sysRoleDao.getAllRoles());
    }
}
