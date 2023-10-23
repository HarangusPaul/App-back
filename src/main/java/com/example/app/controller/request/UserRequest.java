package com.example.app.controller.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class UserRequest {
    private String name;
    private String password;
}
