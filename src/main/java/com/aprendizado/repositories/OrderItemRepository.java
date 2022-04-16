package com.aprendizado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendizado.entities.OrderItem;
import com.aprendizado.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
