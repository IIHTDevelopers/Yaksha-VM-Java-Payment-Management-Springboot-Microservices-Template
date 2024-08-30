package org.training.order.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.training.order.model.dto.OrderDto;
import org.training.order.model.dto.Response;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @PostMapping("/create")
    public ResponseEntity<Response> addOrder(@RequestBody OrderDto orderDto) {
        // write your logic here
        return null;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<OrderDto>> getOrderDetailsByUserId(@PathVariable Long userId) {
        // write your logic here
        return null;
    }

    @GetMapping("/all")
    public ResponseEntity<Page<OrderDto>> getAllOrdersList(Pageable pageable) {
        // write your logic here
        return null;
    }

}
