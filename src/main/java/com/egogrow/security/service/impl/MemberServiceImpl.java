package com.egogrow.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egogrow.security.dao.MemberDAO;
import com.egogrow.security.dto.MemberDTO;
import com.egogrow.security.service.MemberService;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDAO memberDAO;

	@Override
	public MemberDTO findById(int id) {
		return memberDAO.getEntityByKey(id);
	}

	@Override
	public MemberDTO findBySsoId(String ssoId) {
		return memberDAO.findBySsoId(ssoId);
	}

}
