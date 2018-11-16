package com.shopping.shoppingmall.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="purchasedProducts")
@Getter
@Setter
public class PurchasedProducts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "purchaseInfoId")
    private PurchaseInfo purchaseInfo;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Products products;

    private int purchasedPrice;

}
