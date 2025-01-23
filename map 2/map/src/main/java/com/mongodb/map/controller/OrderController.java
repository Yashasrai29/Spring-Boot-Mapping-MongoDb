package com.mongodb.map.controller;

import com.mongodb.map.model.User;
import com.mongodb.map.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value="/map")
public class OrderController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public String placeOrder(@RequestBody User user){
        this.userRepository.save(user);
        return "placed order successfully";
    }

    @GetMapping
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @GetMapping(value="/{id}")
    public Iterable<User> getUserByID(@PathVariable Integer id) {
        return userRepository.findAllById(Collections.singleton(id));
    }

    @GetMapping("getUserByName/{name}")
    public List<User> getByName(@PathVariable String name){
        return userRepository.findByName(name);
    }

    @GetMapping("getUserByCity/{city}")
    public List<User> getByCity(@PathVariable String city){
        return userRepository.findByCity(city);
    }

    @GetMapping(value = "/example")
    public List<User> findAllByExample(@RequestBody User user) {
        Example<User> e=Example.of(user);
        return userRepository.findAll(e);
    }

    @PutMapping
    public User update(@RequestBody User user){
        return userRepository.save(user);
    }
    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Integer id ){
        userRepository.deleteById(id);
    }
}
