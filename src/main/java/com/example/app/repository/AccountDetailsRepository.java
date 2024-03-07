package com.example.app.repository;

import com.example.app.domain.AccountDetails;
import com.example.app.domain.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AccountDetailsRepository extends JpaRepository<AccountDetails, UUID> {
    AccountDetails getAccountDetailsByEmail(String email);
}
