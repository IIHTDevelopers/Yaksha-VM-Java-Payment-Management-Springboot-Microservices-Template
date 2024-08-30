package org.training.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.training.payment.model.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
