package com.shopping.shoppingmall.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="member")
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 255, nullable = false, unique = true)
    private String name;
    @Column(length = 255, nullable = false)
    private String loginId;
    @Column(length = 255, nullable = false)
    private String password;
    @Column(length = 10, nullable = false)
    private String gender;
    @Column(length = 255, nullable = false)
    private String email;
    @Column(length = 50, nullable = false)
    private String zipCode;
    @Column(length = 255, nullable = false)
    private String address;
    @Column(length = 255, nullable = false)
    private String addressDetail;
    private boolean emailReception;
    private boolean messageReception;
    private int point;

    @ManyToMany
    @JoinTable(name = "member_role",
                joinColumns = @JoinColumn(name = "member_id", referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private Set<Role> roles;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<PurchaseInfo> purchaseInfos;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private Set<CartProducts> cartProducts;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private Set<InterestProduct> interestProducts;

    @ManyToMany
    @JoinTable(name = "member_coupon",
            joinColumns = @JoinColumn(name = "member_id", referencedColumnName = "id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "coupon_id", referencedColumnName = "id", nullable = false))
    private Set<Coupon> coupons;


}
