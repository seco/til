package com.shopping.shoppingmall.repository;

import com.shopping.shoppingmall.domain.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import org.springframework.data.domain.Pageable;

@RunWith(SpringRunner.class)
@SpringBootTest
//@DataJpaTest
@Transactional
public class MemberRepositoryTest {
    @Autowired
    MemberRepository memberRepository;

    @Test
    public void 주소포함된Member구하기테스트() throws Exception {
        Pageable pageable = PageRequest.of(0, 5);
        Page<Member> members = memberRepository.findByAddressContaining("서울특별시", pageable);
        System.out.println("------");
        System.out.println(members.getTotalElements());
        System.out.println(members.getTotalPages());
        System.out.println("------");

        for(Member member : members) {
            System.out.println(member.getName());
        }
        System.out.println("------");
    }

    @Test
    public void 이름이포함된member구하기() throws Exception {
        Pageable pageable = PageRequest.of(0, 5);
        Page<Member> members = memberRepository.findByName("신윤철", pageable);

        System.out.println("====");
        for(Member member1 : members) {
            System.out.println(member1.getName()+", "+member1.getLoginId());
        }
        System.out.println("===");
    }

}
