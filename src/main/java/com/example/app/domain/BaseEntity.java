package com.example.app.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.util.UUID;

@MappedSuperclass
public class BaseEntity {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    private UUID id;
}
