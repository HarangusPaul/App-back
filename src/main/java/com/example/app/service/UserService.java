package com.example.app.service;

import com.example.app.controller.request.UserRequest;
import com.example.app.domain.User;
import com.example.app.models.UserDTO;
import com.example.app.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void add(UserRequest userRequest) {
        userRepository.save(new User(userRequest));
    }

    public List<UserDTO> get() {
        return userRepository.findAll().stream().map(UserDTO::new).collect(Collectors.toList());
    }

    public List<UserDTO> getByName(String name) {
        return userRepository.findAll().stream().filter((user -> user.getName().equals(name)))
                .map(UserDTO::new).collect(Collectors.toList());
    }
}
