package com.fc.controller;

import com.fc.bean.Music;
import com.fc.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Music")
public class MusicController {

    @Autowired
    private MusicService musicService;

//    查询所有
    @RequestMapping("findAll")
    public List<Music> findAll() {
        return musicService.findAll();
    }

//    查询单个
    @RequestMapping("findById")
    public Music findById( Integer musicId){
        return musicService.findById(musicId);
    }

//    上一首
    @RequestMapping("prevSong")
    public Music prevSong(Integer musicId){
        return musicService.prevSong(musicId);
    }

//    下一首
    @RequestMapping("nextSong")
    public Music nextSong( Integer musicId){

        return musicService.nextSong(musicId);
    }

//    歌曲模糊查询
    @RequestMapping("search")
    public List<Music> search(String keyword){
        return musicService.search(keyword);
    }






}
