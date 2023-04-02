package com.stc.security.web.service;

import com.stc.security.web.dto.SignUpForm;
import com.stc.security.web.model.Account;
import com.stc.security.web.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImpl implements SignUpService {

    private final AccountRepository accountRepository;

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public SignUpServiceImpl(AccountRepository accountRepository,
                             PasswordEncoder passwordEncoder) {
        this.accountRepository = accountRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void signUp(SignUpForm dto) {
        Account account = Account.builder()
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .email(dto.getEmail())
                .password(passwordEncoder.encode(dto.getPassword()))
                .role(Account.Role.USER)
                .state(Account.State.NOT_CONFIRMED)
                .build();

        accountRepository.save(account);
    }
}
