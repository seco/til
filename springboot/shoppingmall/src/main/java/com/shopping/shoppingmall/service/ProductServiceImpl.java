package com.shopping.shoppingmall.service;

import com.shopping.shoppingmall.repository.ProductsRepasitory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.shopping.shoppingmall.domain.Product;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductsRepasitory productsRepasitory;

    public ProductServiceImpl(ProductsRepasitory productsRepasitory) {
        this.productsRepasitory = productsRepasitory;
    }

    private static int limit = 5;

    @Override
    @Transactional
    public Page<Product> getProducts(int start) {
        Pageable pageable = PageRequest.of(start, limit);
        Page<Product> products = productsRepasitory.findAll(pageable);

        return products;
    }

    //제품이름으로 검색
    @Override
    public Page<Product> findByProductNameContaining(String productName, Pageable pageable) {
        Page<Product> productsByName = productsRepasitory.findByProductNameContaining(productName, pageable);
        return productsByName;
    }
}
