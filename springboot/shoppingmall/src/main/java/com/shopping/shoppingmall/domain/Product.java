package com.shopping.shoppingmall.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="product")
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    private String productName;
    private int price;
    private int point;
    private String nutrient;
    private boolean cutting;
    private int quantity;
    private Date registrationDate;

//    @OneToMany(mappedBy = "product")
//    private Set<PurchasedProducts> purchasedProducts;

    @OneToMany(mappedBy = "product")
    private Set<ProductOption> productOptions;

    @OneToMany(mappedBy = "product")
    private Set<CartProducts> cartProducts;

    @OneToMany(mappedBy = "product")
    private Set<InterestProduct> interestProducts;

}
