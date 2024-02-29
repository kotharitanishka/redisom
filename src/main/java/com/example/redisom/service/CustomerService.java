package com.example.redisom.service;

import java.util.List;
import java.util.Optional;

import com.example.redisom.model.Customer;

public interface CustomerService {
    
    List<Customer> findAll();

    Customer save (Customer customer);

    Optional<Customer> findById(Integer id);

    void deleteById(Integer id);

    List<Customer> findAllByName(String name);

}
