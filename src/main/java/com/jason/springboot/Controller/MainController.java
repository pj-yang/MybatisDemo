package com.jason.springboot.Controller;

import com.jason.springboot.Service.AccountService;
import com.jason.springboot.Service.MenuService;
import com.jason.springboot.entity.Account;
import com.jason.springboot.entity.Menu;
import com.sun.javafx.beans.IDProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    AccountService accSrv;

    @Autowired
    MenuService menuService;

    @RequestMapping(value = "/list")
//    @ResponseBody
    public List<Account> list(){

        List<Account> list = accSrv.findAll();
        return list;
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add(){

        accSrv.add();
        return "add OK~~~~";
    }


    @RequestMapping(value = "/addMenu")
    public Menu getMenu(@RequestParam(required = false) Integer id, @RequestParam(required = false) Integer pagesize, @RequestParam(required = false) Integer pageindex) {
        Menu menu = menuService.findById(id, pageindex, pagesize);
        return menu;
    }

    @RequestMapping(value = "/page")
    public List<Menu> page(@RequestParam(required = false,defaultValue = "1",value = "size") Integer pagesize, @RequestParam(required = false, defaultValue = "1") Integer pageindex) {
        List<Menu> menuList = menuService.findByPage(pageindex, pagesize);
        return menuList;
    }

}
