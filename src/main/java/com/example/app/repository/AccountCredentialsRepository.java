package com.example.app.repository;

import com.example.app.domain.AccountCredentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface AccountCredentialsRepository extends JpaRepository<AccountCredentials, UUID> {
    AccountCredentials findByEmail(String email);
}
