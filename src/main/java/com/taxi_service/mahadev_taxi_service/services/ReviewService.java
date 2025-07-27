package com.taxi_service.mahadev_taxi_service.services;

import com.taxi_service.mahadev_taxi_service.entity.Review;
import com.taxi_service.mahadev_taxi_service.repo.Review_DB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewService {

    @Autowired
    private Review_DB db;

    public java.util.List<Review> getAllReviews() {
        return db.findAll();
    }

    public Review addReview(Review review) {
        return db.save(review);
    }

    public boolean deleteReview(int id) {
        try {
            Review review = db.findById(id).get();
            db.delete(review);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
