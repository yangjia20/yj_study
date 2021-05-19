package com.ck.controller;

import com.ck.entity.User;
import com.ck.service.UserSvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserSvice userSvice;

    @RequestMapping("qureyAll")
    public String qureyAll(ModelMap map){
        List<User> users = userSvice.qureyAll();
        map.put("users", users);
        return "user";
    }

}
