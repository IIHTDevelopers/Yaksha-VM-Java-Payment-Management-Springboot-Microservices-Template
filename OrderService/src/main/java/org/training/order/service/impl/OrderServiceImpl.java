package org.training.order.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.training.order.model.dto.OrderDto;
import org.training.order.model.dto.Response;
import org.training.order.service.OrderService;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public Response addOrder(OrderDto orderDto) {
        // write your logic here
        return null;
    }

    @Override
    public Page<OrderDto> getAllOrdersList(Pageable pageable) {
        // write your logic here
        return null;
    }

    @Override
    public List<OrderDto> getOrderDetailsByUserId(Long userId) {
        // write your logic here
        return null;
    }

}
