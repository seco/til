package com.shopping.shoppingmall.service;

import com.shopping.shoppingmall.domain.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {
    @Autowired
    ProductService productService;

//    @Test
//    public void 상품전체리스트가져오기() {
//        Page<Product> products = productService.getProducts(0, 5);
//
//        for(Product product : products) {
//            System.out.println(productService.getProducts(0, 5));
//        }
//    }
}
