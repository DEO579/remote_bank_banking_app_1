package com.bank.banking1.service.impl;

import com.bank.banking1.dto.AccountDto;
import com.bank.banking1.entity.Account;
import com.bank.banking1.mapper.AccountMapper;
import com.bank.banking1.repository.AccountRepository;
import com.bank.banking1.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    //add account rest api implementation method
    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}
