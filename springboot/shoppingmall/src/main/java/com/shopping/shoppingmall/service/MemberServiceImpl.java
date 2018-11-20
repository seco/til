package com.shopping.shoppingmall.service;

import com.shopping.shoppingmall.domain.Member;
import com.shopping.shoppingmall.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class MemberServiceImpl implements MemberService{
    @Autowired
    MemberRepository memberRepository;

    @Override
    @Transactional
    public Member getMember(String loginId) {
        return memberRepository.getMember(loginId);
    }
}
