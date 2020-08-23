package com.cognixia.jump.controller;

import com.cognixia.jump.model.Customer;
import com.cognixia.jump.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class CustomerController {

    @Autowired
    private CustomerRepo service;

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return service.findAll();
    }

    @PostMapping("/addCustomer")
    public String saveCustomer(@RequestBody Customer customer) {
        service.save(customer);
        return "Added customer with id : " + customer.getId();
    }
}
