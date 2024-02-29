package com.example.redisom.model;
import java.util.List;
import org.springframework.data.annotation.Id;
import com.redis.om.spring.annotations.*;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Document
@RequiredArgsConstructor(staticName = "of")
public class Order {
    
    @Id
    private Integer oId ;

    @NonNull
    @Searchable
    private String date ;

    @NonNull
    @Searchable
    private Integer tCost ;

    @NonNull
    @Indexed
    private List<Product> products ;
}
