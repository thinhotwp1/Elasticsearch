package com.example.elasticsearchdemo.controller;

import com.example.elasticsearchdemo.model.Customer;
import com.example.elasticsearchdemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/findAll")
    public Iterable<Customer> findAllCustomer(){
        return customerRepository.findAll();
    }

    @GetMapping("/findByName/{firstName}")
    public List<Customer> findByFirstName(@PathVariable String firstName){
        return customerRepository.findByFirstName(firstName);
    }

    @PostMapping("/saveCustomer")
    public int saveCustomer(@RequestBody List<Customer> customers){
        customerRepository.saveAll(customers);
        return customers.size();
    }


}
