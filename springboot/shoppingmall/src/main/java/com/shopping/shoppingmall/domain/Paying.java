package com.shopping.shoppingmall.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="paying")
@Getter
@Setter
public class Paying {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "purchaseInfoId")
    private PurchaseInfo purchaseInfo;

    private String paymentWay;

    private String payment;
    private Date paymenetDate;
    private boolean credit;
}
