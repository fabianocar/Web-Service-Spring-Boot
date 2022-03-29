package com.projeto.pedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.pedido.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
