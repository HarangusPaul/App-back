package com.example.app.controller;


import com.example.app.controller.request.AccountCredentialsRequest;
import com.example.app.controller.request.AccountCredentialsRequestValidation;
import com.example.app.models.TokenDTO;
import com.example.app.service.AccountCredentialsService;
import com.example.app.service.TokenService;
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
        } catch (Exception exception) {
            return ResponseEntity.badRequest().body("Not valid account!");
        }
    }

    @PostMapping("/login")
    public ResponseEntity<TokenDTO> logIn(@RequestBody AccountCredentialsRequestValidation requestValidation) {
        try {
            var value = accountCredentialsService.logIn(requestValidation);

            if (value==null) {
                throw new Exception("Invalid!");
            }

            return ResponseEntity.ok().body(value);
        }catch (Exception exception){
            return ResponseEntity.badRequest().build();
        }
    }


    @GetMapping("/valid-token")
    public ResponseEntity validToken() {
        try {
            return ResponseEntity.ok().build();
        } catch (Exception exception) {
            return ResponseEntity.badRequest().build();
        }
    }
}
