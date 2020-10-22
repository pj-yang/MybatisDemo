package com.jason.springboot.Service;

import com.github.pagehelper.PageHelper;
import com.jason.springboot.entity.Menu;
import com.jason.springboot.entity.MenuExample;
import com.jason.springboot.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    @Autowired
    MenuMapper menuMapper;

    public Menu findById(Integer id,Integer pageindex, Integer pagesize) {
        MenuExample menuExample = new MenuExample();

        menuExample.createCriteria().andIdEqualTo(id);

        List<Menu> menuList = menuMapper.selectByExample(menuExample);

        Menu menu = menuMapper.selectByPrimaryKey(id);

        return menu;

    }

    public List<Menu> findByPage(Integer pageindex, Integer pagesize) {

        PageHelper.startPage(pageindex, pagesize);

        MenuExample menuExample = new MenuExample();
        return menuMapper.selectByExample(menuExample);
    }
}
