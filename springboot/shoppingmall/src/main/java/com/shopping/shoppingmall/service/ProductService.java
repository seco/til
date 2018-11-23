package com.shopping.shoppingmall.service;

import com.shopping.shoppingmall.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    public Page<Product> getProducts(int start);
    public Page<Product> findByProductNameContaining(String productName, Pageable pageable);
}
