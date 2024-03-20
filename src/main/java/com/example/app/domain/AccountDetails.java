package com.example.app.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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

    @OneToMany(cascade = CascadeType.ALL)
    private List<Notification> notification;
}
