package com.jason.springboot.Service;

import com.jason.springboot.entity.Account;
import com.jason.springboot.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountMapper mapper;

    public List<Account> findAll(){
       List<Account> list =  mapper.findAll();

       return  list;
    }

    public void add(){
        Account account = new Account();
        account.setId(4);
        account.setAge(21);
        account.setLoginName("ypj");
        account.setNickName("hello");
        account.setPassword("123456");

        mapper.add(account);

    }
}
