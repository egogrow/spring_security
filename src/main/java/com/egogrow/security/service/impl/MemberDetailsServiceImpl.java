package com.egogrow.security.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.egogrow.security.common.StateEnum;
import com.egogrow.security.dto.MemberDTO;
import com.egogrow.security.service.MemberService;
import com.egogrow.security.vo.MemberVO;
import com.egogrow.security.vo.RoleVO;

@Service("memberDetailsService")
public class MemberDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private MemberService memberService;
	
	// 시큐리티의 내용 외 파라미터를 추가하고 싶을 때, 아래 사용 
	boolean accountNonExpired = true; 
	boolean credentialsNonExpired = true; 
	boolean accountNonLocked = true;
	
	@Override
	public UserDetails loadUserByUsername(String ssoId)throws UsernameNotFoundException {
		MemberDTO user = memberService.findBySsoId(ssoId);
        System.out.println("User : "+user);
        
        if(user==null){
            System.out.println("User not found");
            throw new UsernameNotFoundException("Username not found");
        }
        
        boolean enabled = user.getState().equals(StateEnum.Active);
        
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        System.out.println("ROLES = "+user.getRoleList());
        for(RoleVO role : user.getRoleList()){
            System.out.println("role : "+role);
            authorities.add(new SimpleGrantedAuthority("ROLE_"+role.getRoleType()));
        }
        
//      return new User(user.getSsoId(), user.getPassword(), 
//		enabled, true, true, true, authorities);
   
        MemberVO result = new MemberVO(
			user.getSsoId(),
			user.getPassword(), 
			enabled,
			accountNonExpired,
			credentialsNonExpired,
			accountNonLocked,
			authorities,
			user.getEmail()
		);

        return result;        

	}
}
