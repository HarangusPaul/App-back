package com.example.app.repository;

import com.example.app.domain.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TokenRepository extends JpaRepository<Token, UUID> {
    Token getTokenByUserID(UUID uuid);

    Token getTokenByToken(String token);
}
