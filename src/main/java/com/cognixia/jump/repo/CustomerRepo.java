package com.cognixia.jump.repo;

import com.cognixia.jump.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepo  extends MongoRepository<Customer, String> {

}
