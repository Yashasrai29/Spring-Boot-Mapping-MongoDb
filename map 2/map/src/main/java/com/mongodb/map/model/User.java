package com.mongodb.map.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "mapdb")
public class User {
    @Id
    @Field("User_id")
    private int userId;
    @Field("User_name")
    private String name;
    @Field("User_age")
    private String gender;

    private List<Product> product;

    private Address address;

    private List<UserDetails> userDetails;


}
