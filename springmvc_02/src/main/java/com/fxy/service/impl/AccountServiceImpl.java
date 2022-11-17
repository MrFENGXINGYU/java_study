package com.fxy.service.impl;

import com.fxy.dao.AccountDao;
import com.fxy.domain.Account;
import com.fxy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;


    @Override
    public void transfer(String outName, String inName, Double money) {
        accountDao.inMoney(inName,money);
        accountDao.outMoney(outName,money);
    }

    @Override
    public void addAccount(Account account) {
        accountDao.addAccount(account);
    }

    @Override
    public void deleteAccount(Integer id) {
        accountDao.deleteAccount(id);
    }

    @Override
    public List<Account> findAll() {
        List<Account> accountAll = accountDao.findAll();
        return accountAll;
    }

    @Override
    public void inMoney(String username, Double money) {
        accountDao.inMoney(username, money);
    }

    @Override
    public void outMoney(String username, Double money) {
        accountDao.outMoney(username, money);
    }
}
