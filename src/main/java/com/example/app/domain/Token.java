package com.example.app.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "token_validation")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Token extends BaseEntity{
    @Column
    private String token;

    @Column
    private UUID userID;
}
