package com.shopping.shoppingmall.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="purchaseInfo")
@Getter
@Setter
public class PurchaseInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @OneToMany(mappedBy = "purchaseInfo", cascade = CascadeType.ALL)
    private Set<PurchasedGoods> purchasedGoods;
}
