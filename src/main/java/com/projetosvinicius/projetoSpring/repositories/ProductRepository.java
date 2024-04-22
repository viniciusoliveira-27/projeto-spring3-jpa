package com.projetosvinicius.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosvinicius.projetoSpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
