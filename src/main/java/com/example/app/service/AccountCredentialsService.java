package com.example.app.service;


import com.example.app.controller.request.AccountCredentialsRequest;
import com.example.app.controller.request.AccountCredentialsRequestValidation;
import com.example.app.domain.AccountCredentials;
import com.example.app.models.TokenDTO;
import com.example.app.repository.AccountCredentialsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AccountCredentialsService {
    private final AccountCredentialsRepository accountCredentialsRepository;
    private final TokenService tokenService;

    public AccountCredentialsService(AccountCredentialsRepository accountCredentialsRepository, TokenService tokenService) {
        this.accountCredentialsRepository = accountCredentialsRepository;
        this.tokenService = tokenService;
    }

    public void create(AccountCredentialsRequest request) {
        accountCredentialsRepository.save(new AccountCredentials(request));
    }

    public TokenDTO logIn(AccountCredentialsRequestValidation requestValidation) {
        var account = accountCredentialsRepository.findByEmail(requestValidation.getEmail());
        return account.getPassword().equals(requestValidation.getPassword()) ? getToken(account) : null;
    }


    private TokenDTO getToken(AccountCredentials accountCredentials) {
        var token = tokenService.getTokenByUserId(accountCredentials.returnId());
        if (token != null) {
            return new TokenDTO(token.getToken());
        }
        return new TokenDTO(this.tokenService.generateToken(accountCredentials));
    }

    public AccountCredentials returnByEmail(String email) {
        return accountCredentialsRepository.findByEmail(email);
    }
}
