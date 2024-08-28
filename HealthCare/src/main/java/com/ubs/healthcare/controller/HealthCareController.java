package com.ubs.healthcare.controller;

import com.ubs.healthcare.model.Customer;
import com.ubs.healthcare.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HealthCareController {
    @Autowired
    CustomerRepo customerRepo;
    @PostMapping("/addCustomer")
    public void addCustomer(@RequestBody Customer customer){
        System.out.println("Adding customer.");
        customerRepo.save(customer);
        System.out.println("Customer added.");
    }

    @GetMapping("/getCustomer")
    public List<Customer> getCustomer(){
        System.out.println("return all customer.");
        return customerRepo.findAll();
    }

    @GetMapping("/getCustomer/{id}")
    public Customer getCustomer(@PathVariable Integer id){
        System.out.println("Get customer." + id);
        return customerRepo.findById(id).orElse(null);

    }
}
