package com.ck.dao;

import com.ck.entity.BookType;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookTypeDao {

    @Select("select * from booktype where btid=#{id}")
    @ResultMap("booktypes")
    public BookType qureyBookById(@Param("id") int id);

    @Select("select * from booktype")
    public List<BookType> qureyAllType();
}
