package com.egogrow.security.dao;

import org.springframework.stereotype.Repository;

import com.egogrow.security.dto.MemberDTO;

@Repository("memberDAO")
public interface MemberDAO extends BaseDAO<Integer,MemberDTO> {

	public MemberDTO findBySsoId(String ssoId);
	
}