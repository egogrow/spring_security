package com.egogrow.security.vo;

import java.io.Serializable;

import com.egogrow.security.common.RoleTypeEnum;

public class RoleVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private RoleTypeEnum roleType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RoleTypeEnum getRoleType() {
		return roleType;
	}

	public void setRoleType(RoleTypeEnum roleType) {
		this.roleType = roleType;
	}
}
