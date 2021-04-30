package com.fc.dao;

import com.fc.bean.Music;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//dao层接口
@Repository
public interface MusicDao {
//    查询所有歌曲
    List<Music> findAll();

    Music findById(@Param("musicId") Integer musicId);

    List<Music> search(@Param("keyword") String keyword );
}
