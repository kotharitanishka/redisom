package com.example.redisom.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.redisom.model.Customer;
//import com.example.redisom.model.Customer$;
import com.example.redisom.repo.CustomerRepo;
import com.redis.om.spring.search.stream.EntityStream;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepo customerRepo;
    EntityStream entityStream;

    public CustomerServiceImpl(CustomerRepo cr) {
        customerRepo = cr;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepo.findAll();
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public Optional<Customer> findById(Integer id) {
        return customerRepo.findById(id);
        
    }

    @Override
    public void deleteById(Integer id) {
        customerRepo.deleteById(id);
    }

    @Override
    public List<Customer> findAllByName(String name) {

        return null;
        // return entityStream
        //                .of(Customer.class)
        //                .filter(Customer$.NAME.eq(name))
        //                .collect(Collectors.toList());
                    // .of(Customer.class)
                    // .filter(Customer$.name.eq(name))
                    // .collect(Collectors.toList());
  }


}

    
    

