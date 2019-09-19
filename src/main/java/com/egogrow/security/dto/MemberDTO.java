package com.egogrow.security.dto;

import java.io.Serializable;
import java.util.List;

import com.egogrow.security.common.StateEnum;
import com.egogrow.security.vo.RoleVO;

public class MemberDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String ssoId;
	
	private String password;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private StateEnum state;
	
	private List<RoleVO> roleList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSsoId() {
		return ssoId;
	}

	public void setSsoId(String ssoId) {
		this.ssoId = ssoId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public StateEnum getState() {
		return state;
	}

	public void setState(StateEnum state) {
		this.state = state;
	}

	public List<RoleVO> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<RoleVO> roleList) {
		this.roleList = roleList;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", ssoId=" + ssoId + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", state=" + state + ", roleList=" + roleList + "]";
	}
	
	
}
