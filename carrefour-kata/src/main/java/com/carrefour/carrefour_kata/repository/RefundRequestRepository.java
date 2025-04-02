package com.carrefour.carrefour_kata.repository;

import com.carrefour.carrefour_kata.model.RefundRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefundRequestRepository extends JpaRepository<RefundRequest, Long> {
}
