package com.ck.controller;

import com.ck.entity.BookType;
import com.ck.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookTypeController {

    @Autowired
    private BookTypeService bookTypeService;

    @GetMapping("qureyAlltype")
    public String qureyAlltype(ModelMap map){
        List<BookType> bookTypes = bookTypeService.qureyAllType();
        map.put("bookTypes",bookTypes);
        return "p_add";
    }
}
