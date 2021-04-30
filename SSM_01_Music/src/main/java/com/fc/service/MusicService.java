package com.fc.service;

import com.fc.bean.Music;

import java.util.List;

public interface MusicService {
//    查询所有
    List<Music> findAll();

//单个查询
    Music findById( Integer musicId );

//上一首
    Music prevSong( Integer musicId );

//    下一首
    Music nextSong( Integer musicId );

    List<Music> search( String keyword );
}
