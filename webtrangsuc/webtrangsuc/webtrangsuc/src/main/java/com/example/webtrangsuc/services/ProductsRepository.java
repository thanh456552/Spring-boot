package com.example.webtrangsuc.services;

import com.example.webtrangsuc.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Long> {

}
