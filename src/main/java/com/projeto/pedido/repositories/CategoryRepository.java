package com.projeto.pedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.pedido.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
