package com.example.redisom.repo;

import com.example.redisom.model.Customer;
import com.redis.om.spring.repository.RedisDocumentRepository;
import java.util.List;



public interface CustomerRepo extends RedisDocumentRepository<Customer , Integer>{

    List<Customer> findAllByName(String name);
}
