package com.xxxy.erer15.dto;


import com.xxxy.erer15.model.SysRole;

import java.util.List;

public class RoleDto extends SysRole {

	private static final long serialVersionUID = -5784234789156935003L;

	private List<Long> permissionIds;

	public List<Long> getPermissionIds() {
		return permissionIds;
	}

	public void setPermissionIds(List<Long> permissionIds) {
		this.permissionIds = permissionIds;
	}
}
