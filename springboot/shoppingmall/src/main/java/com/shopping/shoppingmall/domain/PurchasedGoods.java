package com.shopping.shoppingmall.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="purchasedGoods")
@Getter
@Setter
public class PurchasedGoods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "purchaseInfoId")
    private PurchaseInfo purchaseInfo;

    @ManyToOne
    @JoinColumn(name = "goodsId")
    private Goods goods;

}
