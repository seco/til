package com.shopping.shoppingmall.controller;

import com.shopping.shoppingmall.domain.Product;
import com.shopping.shoppingmall.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/shop")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/list")
    public String list(ModelMap modelMap,
                       @RequestParam(value = "page", defaultValue = "0") int start) {


        Page<Product> products = productService.getProducts(start);

        modelMap.addAttribute("products", products);
        modelMap.addAttribute("totalPages", products.getTotalPages());


        return "list";
    }
}
