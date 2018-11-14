package com.shopping.shoppingmall.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="couponMember")
@Getter
@Setter
public class CouponMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "couponId")
    private Coupon coupon;

    @ManyToOne
    @JoinColumn(name = "memberId")
    private Member member;

}
