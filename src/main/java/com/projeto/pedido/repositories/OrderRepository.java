package com.projeto.pedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.pedido.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
