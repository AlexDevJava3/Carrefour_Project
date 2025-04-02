package com.carrefour.carrefour_kata.service;

import com.carrefour.carrefour_kata.model.RefundRequest;

public interface RefundService {
    void submitRefundRequest(RefundRequest refundRequest);
}