package com.shopping.shoppingmall.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Delevery")
@Getter
@Setter
public class Delevery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name="purchaseInfoId")
    private PurchaseInfo purchaseInfo;
    private String LocationName;
    private String LocationPhoneNumber;
    private String LocationAddress;
    private String deleveryServiceNumber;
    private String deleveryServiceCompany;
    private String deleveryCondition;
    private String delveryDate;
}
