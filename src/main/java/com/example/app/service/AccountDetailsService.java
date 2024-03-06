package com.example.app.service;
import com.example.app.controller.request.AccountDetailsRequest;
import com.example.app.domain.AccountDetails;
import com.example.app.repository.AccountDetailsRepository;
import com.example.app.service.Email.EmailService;
import org.springframework.stereotype.Service;

@Service
public class AccountDetailsService {
    private final AccountDetailsRepository accountDetailsRepository;

    private final EmailService emailService;

    public AccountDetailsService(AccountDetailsRepository accountDetailsRepository, EmailService emailService) {
        this.accountDetailsRepository = accountDetailsRepository;
        this.emailService = emailService;
    }

    public void create(AccountDetailsRequest request) {
        emailService.sendSimpleMessage(request.getEmail(),"Email verification!","Please verify here:linku tau");
        accountDetailsRepository.save(new AccountDetails(request.getEmail(),request.getLocationOfBrowser(),false));
    }

    public void updateVerification(String email) {
        var accountDetails = accountDetailsRepository.getAccountDetailsByEmail(email);

        accountDetails.setVerified(true);

        accountDetailsRepository.save(accountDetails);
    }
}
