package com.example.redisom.model;

import org.springframework.data.annotation.Id;

import com.redis.om.spring.annotations.Document;
import com.redis.om.spring.annotations.Searchable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Document
@RequiredArgsConstructor(staticName = "of")
public class Customer{

    @Id
    private Integer id ;

    @NonNull
    @Searchable
    private String name ;

    @NonNull
    @Searchable
    private String number ;

    @NonNull
    @Searchable
    private String address ;

    // @NonNull
    // @Indexed
    // private List<Order> orders ;
    
}
