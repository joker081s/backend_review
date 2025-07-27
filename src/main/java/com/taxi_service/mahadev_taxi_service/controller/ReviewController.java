package com.taxi_service.mahadev_taxi_service.controller;

import com.taxi_service.mahadev_taxi_service.entity.Review;
import com.taxi_service.mahadev_taxi_service.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewService service;

    @GetMapping("/getReviews")
    public java.util.List<Review> getAllReviews() {
        return service.getAllReviews();
    }

    @PostMapping("/addReview")
    public Review addReview(@RequestBody Review review) {
        return service.addReview(review);
    }

    @DeleteMapping("/deleteById{id}")
    public boolean deleteById(@PathVariable int id) {
        return service.deleteReview(id);
    }
}
