package com.shopping.shoppingmall.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="Coupon")
@Getter
@Setter
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Date expirationDate;
    private int ratio;

    @OneToMany(mappedBy = "coupon", cascade = CascadeType.ALL)
    private Set<CouponGoods> couponGoods;

    @OneToMany(mappedBy = "coupon", cascade = CascadeType.ALL)
    private Set<CouponMember> couponMembers;
}
