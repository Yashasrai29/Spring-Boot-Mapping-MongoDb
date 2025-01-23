package com.mongodb.map.repo;

import com.mongodb.map.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends MongoRepository<User, Integer> {
//    @Query(value =" {'name':?0}",fields = "{'name':1,'userId':0}")
    @Query(" {'name':?0}")
    List<User> findByName(String name);
    @Query("{'Address.city':?0}")
    List<User> findByCity(String city);
}
