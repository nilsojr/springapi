package com.islandsoftware.springapi.repositories;

import com.islandsoftware.springapi.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
