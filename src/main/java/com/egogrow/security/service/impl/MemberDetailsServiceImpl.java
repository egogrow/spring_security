package com.egogrow.security.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.egogrow.security.dto.MemberDTO;
import com.egogrow.security.enums.StateEnum;
import com.egogrow.security.service.MemberDetailsService;
import com.egogrow.security.service.MemberService;
import com.egogrow.security.user.MemberInfo;

@Service("memberDetailsService")
public class MemberDetailsServiceImpl implements MemberDetailsService {

	@Autowired
	private MemberService memberService;
	
	// 시큐리티의 내용 외 파라미터를 추가하고 싶을 때, 아래 사용 
	boolean accountNonExpired = true; 
	boolean credentialsNonExpired = true; 
	boolean accountNonLocked = true;
	
	@Override
	public UserDetails loadUserByUsername(String ssoId) throws UsernameNotFoundException {
		MemberDTO user = memberService.findBySsoId(ssoId);
        
        if(user==null){
            throw new UsernameNotFoundException("Username not found");
        }
        
        boolean enabled = user.getMemberState().equals(StateEnum.Active);
        
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_"+user.getRoleType()));

        MemberInfo result = new MemberInfo (
			user.getMemberSsoId(),
			user.getMemberPassword(), 
			enabled,
			accountNonExpired,
			credentialsNonExpired,
			accountNonLocked,
			authorities,
			user.getMemberName()
		);

        return result;        

	}
}
