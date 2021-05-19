package com.ck.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookInfo {
    private int bid;
    private String bname;
    private int price;
    private BookType booktype;
    private Date dtime;
    private String imgurl;
    private int state;
}
