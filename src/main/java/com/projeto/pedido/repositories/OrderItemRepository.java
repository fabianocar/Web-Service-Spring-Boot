package com.projeto.pedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.pedido.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
