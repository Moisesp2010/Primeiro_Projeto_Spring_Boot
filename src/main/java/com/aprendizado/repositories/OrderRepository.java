package com.aprendizado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendizado.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
