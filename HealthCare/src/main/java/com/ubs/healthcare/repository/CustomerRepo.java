package com.ubs.healthcare.repository;

import com.ubs.healthcare.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepo extends MongoRepository<Customer,Integer> {
}
