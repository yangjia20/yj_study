package com.ck.dao;

import com.ck.entity.BookInfo;
import com.ck.entity.BookType;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface BookInfoDao {
    public List<BookInfo> qureyLike(HashMap map);

    @Delete("delete from bookinfo where bid=#{id}")
    public void deleteById(int id);

    @Insert("insert into bookinfo values(null,#{bname},#{price},#{btid},#{dtime},#{imgurl},#{state})")
    public void addBookInfo(HashMap map);

    public void deletes(int[] ids);
}
