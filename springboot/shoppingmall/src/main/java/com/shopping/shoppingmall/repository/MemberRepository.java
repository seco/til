package com.shopping.shoppingmall.repository;

import com.shopping.shoppingmall.domain.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MemberRepository extends JpaRepository<Member, Long> {

    public Page<Member> findByAddressContaining(String address, Pageable pageable);

    //JPQL
//    @Query(value = "select ag from member ag where ag.name like CONCAT('%',:name,'%')")
//    public Page<Member> findByNameContaining(@Param("name")String name, Pageable pageable);

    @Query(value = "select ag from Member ag where ag.name like CONCAT('%',:name,'%')")
    public Page<Member> findByName(@Param("name")String name, Pageable pageable);
}
