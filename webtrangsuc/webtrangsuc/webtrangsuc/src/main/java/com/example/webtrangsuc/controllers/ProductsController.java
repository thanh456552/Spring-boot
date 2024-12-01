package com.example.webtrangsuc.controllers;

import com.example.webtrangsuc.models.Product;
import com.example.webtrangsuc.services.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/")
public class ProductsController {

    @Autowired
    private ProductsRepository repo;

    // Trang chủ
    @GetMapping("/")
    public String homeProductList(Model model) {
        List<Product> products = repo.findAll();
        model.addAttribute("products", products);
        return "products/home";
    }

    @GetMapping("/product")
    public String productProductList(Model model) {
        List<Product> products = repo.findAll();
        model.addAttribute("products", products);
        return "products/product";
    }

    @GetMapping("/cart")
    public String cartProductList(Model model) {
        List<Product> products = repo.findAll();
        model.addAttribute("products", products);
        return "products/cart";
    }

    // Trang bán chạy
    // @GetMapping("/banchay")
    // public String banchayProductList(Model model) {
    // List<Product> products = repo.findAll();
    // model.addAttribute("products", products);
    // return "products/banchay";
    // }
}
