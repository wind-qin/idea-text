package com.fc.service;

import com.fc.bean.Sheet;

import java.util.List;

public interface SheetService {
//    查询歌单列表
    List<Sheet> findAll();
//  查询歌单列表中的歌曲
    List<Sheet> findSongsBySheet( String sheetName );

    int insertSheet( String sheetName );
}
