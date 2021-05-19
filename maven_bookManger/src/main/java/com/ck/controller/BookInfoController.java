package com.ck.controller;

import com.ck.entity.BookInfo;
import com.ck.entity.BookType;
import com.ck.service.BookInfoService;
import com.ck.service.BookTypeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class BookInfoController {

    @Autowired
    private BookInfoService bookInfoService;

    @Autowired
    private BookTypeService bookTypeService;

    Logger logger = Logger.getLogger(BookInfoController.class);

    @RequestMapping("qureyLikeAll")
    public String qureyLikeAll(@RequestParam(required = true) HashMap map, ModelMap maps){
        List<BookInfo> bookInfos = bookInfoService.qureyLike(map);
        List<BookType> bookTypes = bookTypeService.qureyAllType();
        maps.put("bookInfos", bookInfos);
        maps.put("bookTypes",bookTypes);
        maps.put("type",map);
        return "p_list";
    }

    @GetMapping("deleteByid")
    public String deleteByid(Integer ids){
        bookInfoService.deleteById(ids);
        return "redirect:qureyLikeAll";
    }



    @PostMapping("addBookInfo")
    public String addBookInfo(@RequestParam HashMap map,MultipartFile file, HttpSession session){
        try {
            String realPath = session.getServletContext().getRealPath("/images/book_img");
            String filename = file.getOriginalFilename(); //文件名字
            filename=filename.replace(filename.substring(0, filename.lastIndexOf(".")), UUID.randomUUID().toString());
            map.put("imgurl", filename);
            filename=realPath+filename;
            file.transferTo(new File(filename));
        } catch (Exception e) {
            e.printStackTrace();
        }
        bookInfoService.addBookInfo(map);
        return "redirect:qureyLikeAll";
    }

    @GetMapping("deletes")
    public String deletes(int[] ids){
        for (int i = 0; i < ids.length; i++) {
            System.out.println(ids[i]);
        }
        bookInfoService.deletes(ids);
        return "redirect:qureyLikeAll";
    }
}
