package com.ck.service;

import com.ck.entity.BookInfo;
import com.ck.entity.BookType;

import java.util.HashMap;
import java.util.List;

public interface BookInfoService {
    public List<BookInfo> qureyLike(HashMap map);
    public void deleteById(int id);
    public void addBookInfo(HashMap map);
    public void deletes(int[] ids);
}
