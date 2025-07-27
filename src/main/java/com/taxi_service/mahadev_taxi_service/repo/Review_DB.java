package com.taxi_service.mahadev_taxi_service.repo;

import com.taxi_service.mahadev_taxi_service.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Review_DB extends JpaRepository<Review, Integer> {
}
