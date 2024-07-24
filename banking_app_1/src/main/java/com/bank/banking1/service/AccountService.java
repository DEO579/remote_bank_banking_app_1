package com.bank.banking1.service;

import com.bank.banking1.dto.AccountDto;

public interface AccountService {
    //add account rest api abstract method
    AccountDto createAccount(AccountDto accountDto);

}
