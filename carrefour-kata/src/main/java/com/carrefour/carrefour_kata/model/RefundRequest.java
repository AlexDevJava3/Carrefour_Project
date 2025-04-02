package com.carrefour.carrefour_kata.model;

import jakarta.persistence.*;

@Entity
@Table(name = "refund_requests")
public class RefundRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long orderId;

    @Column(nullable = false)
    private Long productId;

    @Column(nullable = false)
    private String issueDescription;

    @Column(nullable = false)
    private String evidencePictureUrl;
    
    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public String getEvidencePictureUrl() {
        return evidencePictureUrl;
    }

    public void setEvidencePictureUrl(String evidencePictureUrl) {
        this.evidencePictureUrl = evidencePictureUrl;
    }

}