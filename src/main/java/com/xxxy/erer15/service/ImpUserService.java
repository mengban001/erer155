package com.xxxy.erer15.service;

import com.xxxy.erer15.base.result.Results;
import com.xxxy.erer15.model.SysUser;

/**
 * ImpUserService
 *
 * @author erer
 * @date 2020/2/29
 */
public interface ImpUserService {
    SysUser getUser(String username);
    Results<SysUser> getAllUsersByPage(Integer offSet , Integer limit);
    Results<SysUser> sava(SysUser sysUser, Integer roleId) ;
    SysUser getUserByPhone(String telephone) ;

    SysUser getUserById(Long id);
}
