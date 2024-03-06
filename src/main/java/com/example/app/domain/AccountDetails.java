package com.example.app.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "account_details")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AccountDetails extends BaseEntity{
    private String email;
    private String locationOfBrowser;
    private Boolean verified;
}
