package com.shopping.shoppingmall.service;

import com.shopping.shoppingmall.domain.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {
    public Page<Product> getProducts(int start, int limit);
}
