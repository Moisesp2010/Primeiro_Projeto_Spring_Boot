package com.aprendizado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendizado.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}