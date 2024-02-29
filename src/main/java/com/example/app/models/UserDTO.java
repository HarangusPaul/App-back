package com.example.app.models;

import com.example.app.domain.User;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDTO {
    private String name;
    private String password;

    public UserDTO(User user) {
        this.name = user.getName();
        this.password = user.getPassword();
    }
}
