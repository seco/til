package com.shopping.shoppingmall.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<GoodsRepository, Long> {

    public Page<GoodsRepository> findByGoodsNameContaining(String goodsName, Pageable pageable);
}
