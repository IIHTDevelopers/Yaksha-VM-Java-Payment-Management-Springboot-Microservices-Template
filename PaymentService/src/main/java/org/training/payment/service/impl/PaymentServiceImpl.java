package org.training.payment.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.training.payment.model.dto.PaymentDto;
import org.training.payment.model.dto.Response;
import org.training.payment.service.PaymentService;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public Response addPayment(PaymentDto paymentDto) {
        // write your logic here
        return null;
    }

    @Override
    public Page<PaymentDto> getAllPaymentList(Pageable pageable) {
        // write your logic here
        return null;
    }

    @Override
    public List<PaymentDto> getPaymentDetailsByUserId(Long userId) {
        // write your logic here
        return null;
    }

}
