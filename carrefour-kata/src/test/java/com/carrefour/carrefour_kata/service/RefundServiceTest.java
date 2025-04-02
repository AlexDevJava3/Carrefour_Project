package com.carrefour.carrefour_kata.service;

import com.carrefour.carrefour_kata.model.RefundRequest;
import com.carrefour.carrefour_kata.repository.RefundRequestRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class RefundServiceTest {

    @InjectMocks
    private RefundServiceImpl refundService;

    @Mock
    private RefundRequestRepository refundRequestRepository;

    @Test
    public void testSubmitRefundRequest() {
        RefundRequest refundRequest = new RefundRequest();
        refundRequest.setOrderId(1L);
        refundRequest.setProductId(101L);
        refundRequest.setIssueDescription("Defective product");
        refundRequest.setEvidencePictureUrl("http://example.com/evidence.jpg");

        refundService.submitRefundRequest(refundRequest);

        verify(refundRequestRepository).save(refundRequest);
    }
}