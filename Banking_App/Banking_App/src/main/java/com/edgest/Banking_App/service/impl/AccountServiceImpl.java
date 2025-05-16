package com.edgest.Banking_App.service.impl;

import com.edgest.Banking_App.dto.AccountDto;
import com.edgest.Banking_App.entity.Account;
import com.edgest.Banking_App.mapper.AccountMapper;
import com.edgest.Banking_App.repository.AccountRepository;
import com.edgest.Banking_App.service.AccoountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccoountService {
    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}


