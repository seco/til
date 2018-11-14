package com.shopping.shoppingmall.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="couponGoods")
@Getter
@Setter
public class CouponGoods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "couponId")
    private Coupon coupon;

    @ManyToOne
    @JoinColumn(name = "goodsId")
    private Goods goods;
}
