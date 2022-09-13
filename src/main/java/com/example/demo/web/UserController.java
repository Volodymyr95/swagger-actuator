package com.example.demo.web;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto createUser(@RequestBody UserDto userDto) {
        return userDto;
    }

    @GetMapping("/user/{id}")
    public long getId(@PathVariable Long id) {
        return id;
    }
}
