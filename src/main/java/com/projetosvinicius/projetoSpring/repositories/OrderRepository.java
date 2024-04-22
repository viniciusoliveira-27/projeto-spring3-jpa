package com.projetosvinicius.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosvinicius.projetoSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
