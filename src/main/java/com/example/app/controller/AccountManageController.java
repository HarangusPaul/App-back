package com.example.app.controller;


import com.example.app.controller.request.AccountCredentialsRequest;
import com.example.app.controller.request.AccountCredentialsRequestValidation;
import com.example.app.models.TokenDTO;
import com.example.app.service.AccountCredentialsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/app/v1/accounts")
public class AccountManageController {
    private final AccountCredentialsService accountCredentialsService;

    public AccountManageController(AccountCredentialsService accountCredentialsService) {
        this.accountCredentialsService = accountCredentialsService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> createAccount(@RequestBody AccountCredentialsRequest request) {
        try {
            accountCredentialsService.create(request);

            return ResponseEntity.ok().build();
        }catch (Exception exception){
            return ResponseEntity.badRequest().body("Not valid account!");
        }
    }

    @GetMapping("/login")
    public TokenDTO logIn(@RequestBody AccountCredentialsRequestValidation requestValidation) {
        return accountCredentialsService.logIn(requestValidation);
    }
}
