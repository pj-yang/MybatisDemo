package com.jason.springboot.mapper;

import com.jason.springboot.entity.Menu;
import com.jason.springboot.entity.MenuExample;
import org.springframework.stereotype.Repository;

/**
 * MenuDAO继承基类
 */
@Repository
public interface MenuMapper extends MyBatisBaseDao<Menu, Integer, MenuExample> {
}