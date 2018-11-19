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


    @ManyToMany
    @JoinTable(name = "product_coupon",
                joinColumns = @JoinColumn(name = "coupon_id", referencedColumnName = "id", nullable = false),
                inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false))
    private Set<Product> products;

    private int quantity; // quantity of coupon

}
