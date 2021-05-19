package com.ck.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookType {
    private int btid;
    private String btname;
    private List<BookInfo> bookinfoList;
}
