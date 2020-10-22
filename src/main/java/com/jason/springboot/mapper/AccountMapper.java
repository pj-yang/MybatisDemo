package com.jason.springboot.mapper;

import com.jason.springboot.entity.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Mapper
//也可以在入口处添加mapperscan 注解
public interface AccountMapper {

    @Select("select * from account")
    public List<Account> findAll();

    public int add(Account account);
}
