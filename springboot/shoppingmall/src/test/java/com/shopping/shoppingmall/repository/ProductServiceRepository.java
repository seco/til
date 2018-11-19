package com.shopping.shoppingmall.repository;

import com.shopping.shoppingmall.domain.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
//@DataJpaTest
@Transactional
public class ProductServiceRepository {
    @Autowired
    ProductsRepasitory productsRepasitory;

    @Test
    public void 제품검색하기() throws Exception {
        Pageable pageable = PageRequest.of(0, 5);
        Page<Product> products = productsRepasitory.findByProductNameContaining("호밀", pageable);

        for(Product product : products) {
            System.out.println(product.getProductName()+", "+product.getPrice());
        }

    }
}
