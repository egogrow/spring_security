package com.egogrow.security.vo;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class MemberVO extends User {

	private static final long serialVersionUID = 1L;

//	private int id; // 일련번호
//	private String ssoId; // 아이디
//	private String password; // 비밀번호
//	private String firstName; // 닉네임1
//	private String lastName; // 닉네임2
	private String email; // 이메일
//	private boolean enable; // 사용여부
//	private List<GrantedAuthority> authorities; // 권한
	
	public MemberVO(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities, String email) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

//	public void setEmail(String email) {
//		this.email = email;
//	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "; Email: "+this.email;
	}	

}
