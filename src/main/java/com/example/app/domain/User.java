package com.example.app.domain;

import com.example.app.controller.request.UserRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User extends BaseEntity {
//    @Column(columnDefinition = "txt")
    private String name;
    private String password;

    public User(UserRequest userRequest) {
        this.name = userRequest.getName();
        this.password = userRequest.getPassword();
    }
}
