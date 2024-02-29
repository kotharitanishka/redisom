package com.example.redisom.model;
import org.springframework.data.annotation.Id;
import com.redis.om.spring.annotations.Document;
import com.redis.om.spring.annotations.Searchable;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Document
@RequiredArgsConstructor(staticName = "of")
public class Product {
    
    @Id
    private Integer pId ;

    @NonNull
    @Searchable
    private String pName ;

    @NonNull
    @Searchable
    private Integer pCost ;

}
