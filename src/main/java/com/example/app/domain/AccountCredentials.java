package com.example.app.domain;


import com.example.app.controller.request.AccountCredentialsRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "account_credentials")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AccountCredentials extends BaseEntity{
    @Column
    private String email;

    @Column
    private String username;

    @Column
    private String password;


    public AccountCredentials(AccountCredentialsRequest request) {
        email = request.getEmail();
        username = request.getUsername();
        password = request.getPassword();
    }
}
