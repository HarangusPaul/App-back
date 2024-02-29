package com.example.app.service;


import com.example.app.controller.request.AccountCredentialsRequest;
import com.example.app.controller.request.AccountCredentialsRequestValidation;
import com.example.app.domain.AccountCredentials;
import com.example.app.models.TokenDTO;
import com.example.app.repository.AccountCredentialsRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountCredentialsService {
    private final AccountCredentialsRepository accountCredentialsRepository;

    public AccountCredentialsService(AccountCredentialsRepository accountCredentialsRepository) {
        this.accountCredentialsRepository = accountCredentialsRepository;
    }

    public void create(AccountCredentialsRequest request) {
        accountCredentialsRepository.save(new AccountCredentials(request));
    }

    public TokenDTO logIn(AccountCredentialsRequestValidation requestValidation) {
        var account = accountCredentialsRepository.findByEmail(requestValidation.getEmail());
        return account.getPassword().equals(requestValidation.getPassword())?new TokenDTO("ValidToken"):null;
    }
}
