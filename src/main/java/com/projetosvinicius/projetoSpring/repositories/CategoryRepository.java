package com.projetosvinicius.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosvinicius.projetoSpring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
