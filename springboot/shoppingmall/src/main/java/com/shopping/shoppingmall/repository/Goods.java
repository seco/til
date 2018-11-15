package com.shopping.shoppingmall.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public class Goods extends JpaRepository<Goods, Long> {

    public Page<Goods> findByGoodsNameContaining(String goodsName, Pageable pageable);
}
