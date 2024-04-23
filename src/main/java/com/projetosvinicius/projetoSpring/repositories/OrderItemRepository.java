package com.projetosvinicius.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosvinicius.projetoSpring.entities.OrderItem;
import com.projetosvinicius.projetoSpring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
