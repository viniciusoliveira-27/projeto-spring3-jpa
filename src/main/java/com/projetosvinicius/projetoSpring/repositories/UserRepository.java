package com.projetosvinicius.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosvinicius.projetoSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
