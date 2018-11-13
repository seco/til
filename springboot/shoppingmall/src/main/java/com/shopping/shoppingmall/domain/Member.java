package com.shopping.shoppingmall.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="member")
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long indexId;
    @Column(length = 255, nullable = false, unique = true)
    private String name;
    @Column(length = 255, nullable = false)
    private String id;
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

    @OneToMany(mappedBy = "member")
    private List<PurchaseInfo> purchaseInfos;
}
