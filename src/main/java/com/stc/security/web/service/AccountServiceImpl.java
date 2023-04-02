package com.stc.security.web.service;

import com.stc.security.web.model.Account;
import com.stc.security.web.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public List<Account> getAllAccountByPassword(String password) {
        return accountRepository.getAllByPassword(password);
    }

    @Override
    public List<Account> getAllAccountByEmail(String email) {
        return accountRepository.getAllByEmail(email);
    }
}
