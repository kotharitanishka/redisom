package com.example.redisom.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.redisom.model.Customer;
import com.example.redisom.service.CustomerService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
@RequestMapping("/customers")
public class CustomerController{

    @Autowired
    private CustomerService customerService ;

    public CustomerController(CustomerService cs) {
        customerService = cs;
    } 

    @GetMapping("/list")
    public List<Customer> getCustomerList() {
        //public String getCustomerList() {
        //return "hiiiiii";
        // Product p = Product.of("lipstick", 1900);
        // Order o = Order.of("28-02-2024", 1900, p);
        // Customer c = Customer.of("kt", "12345", "west");
        // customerService.save(c);
        return customerService.findAll();
    }

    @PostMapping("/add")
    public Customer addCustomer(@RequestBody Customer  c) {
        return customerService.save(c);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Integer id, @RequestBody String name) {
        Customer cust = customerService.findById(id).get();
        cust.setName(name);
        return customerService.save(cust);
    }

    @GetMapping("/{id}")
    public Optional<Customer> getCustomerById(@PathVariable Integer id) {
        return customerService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomerById(@PathVariable Integer id){
        customerService.deleteById(id);
    }

    // @GetMapping("name/{name}")
    // public Customer getCustomerByName(@PathVariable String name) {
    //     return customerService.findAllByName(name);
    // }
    
    
    
}
