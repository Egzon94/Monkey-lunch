package com.activity.munchmonkeys.repository;

import com.activity.munchmonkeys.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
