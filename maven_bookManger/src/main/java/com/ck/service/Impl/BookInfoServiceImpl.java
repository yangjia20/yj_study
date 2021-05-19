package com.ck.service.Impl;

import com.ck.dao.BookInfoDao;
import com.ck.entity.BookInfo;
import com.ck.entity.BookType;
import com.ck.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Service
public class BookInfoServiceImpl implements BookInfoService {

    @Autowired
    private BookInfoDao bookInfoDao;

    public List<BookInfo> qureyLike(HashMap map) {
        return bookInfoDao.qureyLike(map);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        bookInfoDao.deleteById(id);
    }


    @Transactional
    public void addBookInfo(HashMap map) {
        bookInfoDao.addBookInfo(map);
    }

    @Transactional
    public void deletes(int[] ids){
        bookInfoDao.deletes(ids);
    }

}
