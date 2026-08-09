package com.banking.accountservice.service;

import com.banking.accountservice.dto.AccountResponse;
import com.banking.accountservice.dto.CreateAccountRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public AccountResponse createAccount(@Valid CreateAccountRequest request) {
        return null; // Implement the logic to create an account and return the response
    }

    public AccountResponse getAccount(String accountNumber) {
        return null; // Implement the logic to fetch an account by accountNumber
    }
}
