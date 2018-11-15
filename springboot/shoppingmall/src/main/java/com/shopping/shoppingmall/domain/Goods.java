package com.shopping.shoppingmall.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="goods")
@Getter
@Setter
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    private String goodsName;
    private int price;
    private int point;
    private String nutrient;
    private boolean cutting;
    private int quantity;
    private Date registrationDate;

    @OneToMany(mappedBy = "goods", cascade = CascadeType.ALL)
    private Set<PurchasedGoods> purchasedGoods;

    @OneToMany(mappedBy = "goods", cascade = CascadeType.ALL)
    private Set<GoodsOption> goodsOptions;

    @OneToMany(mappedBy = "goods", cascade = CascadeType.ALL)
    private Set<Cart> carts;

    @OneToMany(mappedBy = "goods", cascade = CascadeType.ALL)
    private Set<MyGoodsList> myGoodsLists;

    @OneToMany(mappedBy = "goods", cascade = CascadeType.ALL)
    private Set<CouponGoods> couponGoods;
}
