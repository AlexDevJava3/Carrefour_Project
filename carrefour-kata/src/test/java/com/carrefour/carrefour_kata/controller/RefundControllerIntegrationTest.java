package com.carrefour.carrefour_kata.controller;

import com.carrefour.carrefour_kata.model.RefundRequest;
import com.carrefour.carrefour_kata.service.RefundService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class RefundControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RefundService refundService;

    @Test
    public void testSubmitRefundRequest() throws Exception {
        String refundRequestJson = "{\"orderId\":1,\"productId\":1,\"issueDescription\":\"Defective product\",\"evidencePictureUrl\":\"http://example.com/evidence.jpg\"}";

        mockMvc.perform(post("/refunds")
                          .contentType(MediaType.APPLICATION_JSON)
                          .content(refundRequestJson))
                  .andExpect(status().isOk());

        verify(refundService).submitRefundRequest(org.mockito.ArgumentMatchers.any(RefundRequest.class));
    }
}