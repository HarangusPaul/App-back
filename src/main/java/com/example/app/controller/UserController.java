package com.example.app.controller;

import com.example.app.domain.User;
import com.example.app.models.UserDTO;
import com.example.app.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.QueryParam;
import java.util.List;

@RestController
@RequestMapping(value = "/app/v1/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/add")
    public void add(@QueryParam(value = "name") String name) {
        userService.add(name);
    }

    @GetMapping(value = "/get")
    public List<UserDTO> get() {
        return userService.get();
    }
}
