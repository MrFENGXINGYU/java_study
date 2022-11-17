package com.fxy.service;

import com.fxy.domain.Account;
import org.apache.ibatis.annotations.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AccountService {
    @Transactional
    public void transfer(String outName, String inName, Double money);

    void addAccount(Account account);

    void deleteAccount(Integer id);

    List<Account> findAll();

    void inMoney(String username,Double money);

    void outMoney(String username, Double money);

}
