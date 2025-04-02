package com.carrefour.carrefour_kata.service;

import com.carrefour.carrefour_kata.model.RefundRequest;
import com.carrefour.carrefour_kata.repository.RefundRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RefundServiceImpl implements RefundService {

    @Autowired
    private RefundRequestRepository refundRequestRepository;

    @Override
    public void submitRefundRequest(RefundRequest refundRequest) {
        refundRequestRepository.save(refundRequest);
    }
}