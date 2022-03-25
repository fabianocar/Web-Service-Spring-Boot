package com.projeto.pedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.pedido.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
