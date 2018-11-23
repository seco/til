package com.shopping.shoppingmall.repository;

import com.shopping.shoppingmall.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductsRepasitory extends JpaRepository<Product, Long> {

    @Query(value = "select p from Product p where p.productName like CONCAT('%',:productName,'%')")
    public Page<Product> findByProductNameContaining(@Param("productName") String productName, Pageable pageable);


}
