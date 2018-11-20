package com.shopping.shoppingmall;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncodeTest {
    private PasswordEncoder passwordEncoder;

    @Before
    public void setUp() throws Exception {
        passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Test
    public void passwordEncode() throws Exception {
        String encode = passwordEncoder.encode("1234");
        System.out.println(encode);

        boolean matches = passwordEncoder.matches("1234", "{bcrypt}$2a$10$8EcDedLOUbfMjh2SNMH9Fu.iWnwH6EYtqYgV92pAeZotv0OKXB1dC");
        Assert.assertTrue(matches);
    }
}
