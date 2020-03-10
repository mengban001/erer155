package com.xxxy.erer15.service;

import com.alibaba.fastjson.JSONArray;
import com.xxxy.erer15.base.result.Results;
import com.xxxy.erer15.model.SysPermission;

import java.util.List;

public interface PermissionService {

    Results<JSONArray> listAllPermission();

    Results<SysPermission> listByRoleId(Integer intValue);

    Results<SysPermission> getMenuAll();

    Results<SysPermission> save(SysPermission sysPermission);

    SysPermission getSysPermissionById(Integer id);

    Results  updateSysPermission(SysPermission sysPermission);

    Results delete(Integer id);

    List<SysPermission> getMenu();

    Results<SysPermission> getMenu(Long userId);
}
