package com.fxy.controller;

import com.alibaba.fastjson.JSON;
import com.fxy.domain.Account;
import com.fxy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/accounts")
@CrossOrigin
public class AccountController {
    @Autowired
    private AccountService accountService;

//    @RequestMapping(value = "/account/{outName}/{inName}/{money}")
//    @ResponseBody
//    public void transfer(@PathVariable String outName, String inName, Double money) {
//        accountService.transfer(outName, inName, money);
//    }

    @PostMapping
    void addAccount(@RequestBody Account account){
        accountService.addAccount(account);
    }


    @DeleteMapping("/{id}")
    void deleteAccount(@PathVariable Integer id) {
        accountService.deleteAccount(id);
    }


    @GetMapping
    public List<Account> findAll() {
//        List<Account> list = new ArrayList<>();
        List<Account> all = accountService.findAll();
        System.out.println(all);
//        JSON.toJSONString(all);
        return all;
    }


//    @RequestMapping(value = "/accounts/{username}{money}",method = RequestMethod.PUT)
//    @ResponseBody
//    void inMoney(@PathVariable String username,Double money) {
//        accountService.inMoney(username, money);
//    }


//    @RequestMapping(value = "/accounts/{username}{money}",method = RequestMethod.PUT)
//    @ResponseBody
//    public void outMoney(String username, Double money) {
//        accountService.outMoney(username, money);
//    }
}
