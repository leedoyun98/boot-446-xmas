package com.example.demo.services;

import com.example.demo.domains.UserDto;

import org.springframework.stereotype.Component;

@Component
public interface UserService {
    public void join(UserDto user);
}
