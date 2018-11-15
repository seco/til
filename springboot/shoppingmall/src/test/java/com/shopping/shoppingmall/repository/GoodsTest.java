package com.shopping.shoppingmall.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
public class GoodsTest {

    @Autowired
    GoodsRepository goodsRepository;

    @Test
    public void goodsTest() throws Exception {
        PageRequest pageable = PageRequest.of(0, 5);
        Page<GoodsRepository> goods = goodsRepository.findByGoodsNameContaining("호밀", (org.springframework.data.domain.Pageable) pageable);

        System.out.println(goods.getTotalElements());
        System.out.println(goods.getTotalPages());
    }
}
