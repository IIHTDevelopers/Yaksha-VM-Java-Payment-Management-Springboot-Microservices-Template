package org.training.payment.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.training.payment.model.dto.PaymentDto;
import org.training.payment.model.dto.Response;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @PostMapping("/create")
    public ResponseEntity<Response> addPayment(@RequestBody PaymentDto paymentDto) {
        // write your logic here
        return null;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<PaymentDto>> getPaymentDetailsByUserId(@PathVariable Long userId) {
        // write your logic here
        return null;
    }

    @GetMapping("/all")
    public ResponseEntity<Page<PaymentDto>> getAllPaymentList(Pageable pageable) {
        // write your logic here
        return null;
    }

}
