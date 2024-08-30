package org.training.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.training.order.model.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
