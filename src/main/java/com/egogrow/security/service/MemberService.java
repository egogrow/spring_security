package com.egogrow.security.service;

import com.egogrow.security.dto.MemberDTO;

public interface MemberService {

	public MemberDTO findById(int id);
    
	public MemberDTO findBySsoId(String ssoId);
	
}
