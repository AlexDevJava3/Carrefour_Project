package com.carrefour.carrefour_kata.controller;

import com.carrefour.carrefour_kata.model.RefundRequest;
import com.carrefour.carrefour_kata.service.RefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/refunds")
public class RefundController {

    @Autowired
    private RefundService refundService;

    @PostMapping
    public void submitRefundRequest(@RequestBody RefundRequest refundRequest) {
        refundService.submitRefundRequest(refundRequest);
    }
}