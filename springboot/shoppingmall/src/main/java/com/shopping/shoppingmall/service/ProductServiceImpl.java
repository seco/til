package com.shopping.shoppingmall.service;

import com.shopping.shoppingmall.repository.ProductsRepasitory;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductImpl implements Product {
    private ProductsRepasitory productsRepasitory;

    public ProductImpl(ProductsRepasitory productsRepasitory) {
        this.productsRepasitory = productsRepasitory;
    }

    @Override
    @Transactional
    public List<Product> getProducts(int start, int limit) {
        return productsRepasitory.findAll(, PageRequest.of(start, limit));
    }
}
