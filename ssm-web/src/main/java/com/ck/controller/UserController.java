package com.ck.controller;

import com.ck.entity.User;
import com.ck.service.Userservice;
import com.ck.service.UserserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private Userservice userservice;

    @GetMapping("/qureyAll")
    public String qureyAll(ModelMap map){
        List<User> users = userservice.qureyAll();
        map.put("users", users);
        return "user";
    }
}
