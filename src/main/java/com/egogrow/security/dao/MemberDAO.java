package com.egogrow.security.dao;

import com.egogrow.security.dto.MemberDTO;

public interface MemberDAO extends BaseDAO<Integer,MemberDTO> {

	public MemberDTO findBySsoId(String ssoId);
	
}