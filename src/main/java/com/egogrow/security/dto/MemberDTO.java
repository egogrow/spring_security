package com.egogrow.security.dto;

import java.io.Serializable;
import java.util.List;

import com.egogrow.security.enums.RoleTypeEnum;
import com.egogrow.security.enums.StateEnum;

public class MemberDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int memberId;
	
	private String memberSsoId;
	
	private String memberPassword;
	
	private String memberName;
	
	private String memberEmail;
	
	private StateEnum memberState;
	
	private List<MemberDTO> roleList;
	
	private int roleId;
	
	private RoleTypeEnum roleType;

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberSsoId() {
		return memberSsoId;
	}

	public void setMemberSsoId(String memberSsoId) {
		this.memberSsoId = memberSsoId;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public StateEnum getMemberState() {
		return memberState;
	}

	public void setMemberState(StateEnum memberState) {
		this.memberState = memberState;
	}

	public List<MemberDTO> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<MemberDTO> roleList) {
		this.roleList = roleList;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public RoleTypeEnum getRoleType() {
		return roleType;
	}

	public void setRoleType(RoleTypeEnum roleType) {
		this.roleType = roleType;
	}

	@Override
	public String toString() {
		return "MemberDTO [memberId=" + memberId + ", memberSsoId=" + memberSsoId + ", memberPassword=" + memberPassword
				+ ", memberName=" + memberName + ", memberEmail=" + memberEmail + ", memberState=" + memberState
				+ ", roleList=" + roleList + ", roleId=" + roleId + ", roleType=" + roleType + "]";
	}
	
}
