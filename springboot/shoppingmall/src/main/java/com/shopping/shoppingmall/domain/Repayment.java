package com.shopping.shoppingmall.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="repayment")
@Getter
@Setter
public class Repayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "purchasedProductId")
    private PurchasedProducts purchasedProducts;

    private boolean repayment;
    private String repaymentReason;
    private Date repaymentDate;

}
