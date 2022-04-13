package com.aprendizado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendizado.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
