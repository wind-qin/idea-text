package com.fc.service.impl;

import com.fc.bean.Music;
import com.fc.dao.MusicDao;
import com.fc.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {

    @Autowired
    private MusicDao musicDao;

    public int index;

    @Override
    public List<Music> findAll() {
        return musicDao.findAll();
    }

    @Override
    public Music findById( Integer musicId ) {
        return musicDao.findById(musicId);
    }

    //    上一首
    @Override
    public Music prevSong( Integer musicId ) {
        List<Music> list = musicDao.findAll();

        int index = 0;

        for (int i = 0; i < list.size(); i++) {
//            当前id是否为列表id
            if (musicId.equals(list.get(i).getMusicId())) {

                index = i;
                break;
            }
        }

//        如果index等于0；那么列表数-1；不是那么index-1
        index = index == 0 ? list.size() - 1 : index - 1;


        return list.get(index);
    }

    //    下一首
    @Override
    public Music nextSong( Integer musicId ) {
        List<Music> list = musicDao.findAll();

        int index = 0;

        for (int i = 0; i < musicDao.findAll().size(); i++) {
            if (musicId.equals(list.get(i).getMusicId())) {
                index = i;
                break;
            }
        }
//        如果当前歌曲为最后一首，那么拿到第一首的下标
//        否则拿到下一首
        index = index == list.size() - 1 ? 0 : index + 1;

        return list.get(index);
    }

    //    模糊查询
    @Override
    public List<Music> search( String keyword ) {
        return musicDao.search("%" + keyword + "%");
    }
}
