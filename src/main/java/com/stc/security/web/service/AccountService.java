package com.stc.security.web.service;

import com.stc.security.web.model.Account;

import java.util.List;

public interface AccountService {

    List<Account> getAllAccounts();
    List<Account> getAllAccountByPassword(String password);

    List<Account> getAllAccountByEmail(String email);
}
