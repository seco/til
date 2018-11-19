package com.shopping.shoppingmall.service;

import java.util.List;

public interface Product {
    public List<Product> getProducts(int start, int limit);
}
