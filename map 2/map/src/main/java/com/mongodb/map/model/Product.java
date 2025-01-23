package com.mongodb.map.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Product {

    @Field("Product_name")
    private String name;
    @Field("Product_quantity")
    private int quantity;
    @Field("Product_price")
    private int price;


}
