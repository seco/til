package com.shopping.shoppingmall.security;

import com.shopping.shoppingmall.domain.Member;
import com.shopping.shoppingmall.domain.Role;
import com.shopping.shoppingmall.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collection;

@Component
public class ShoppingUserDetailsService implements UserDetailsService {
    @Autowired
    MemberService memberService;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String loginId) throws UsernameNotFoundException {
        Member member = memberService.getMember(loginId);
        if(member == null)
            throw new UsernameNotFoundException(loginId+" is not found");

        Collection<GrantedAuthority> authrities = new ArrayList<>();
        for(Role role : member.getRoles()) {
            authrities.add(new SimpleGrantedAuthority("ROLE_"+role.getName()));
        }

        UserDetails userDetails = new User(loginId, member.getPassword(), authrities);
        return userDetails;
    }
}
