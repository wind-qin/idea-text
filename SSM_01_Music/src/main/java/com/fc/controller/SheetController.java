package com.fc.controller;

import com.fc.bean.Sheet;
import com.fc.service.SheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("Sheet")
public class SheetController {

    @Autowired
    private SheetService sheetService;

    //  查询所有歌单
    @RequestMapping("findAll")
    public List<Sheet> findAll() {
        return sheetService.findAll();
    }

    //  查询歌单中的歌曲
    @RequestMapping("findSongsBySheet")
    public List<Sheet> findSongsBySheet( String sheetName ) {
        return sheetService.findSongsBySheet(sheetName);
    }

    //    添加歌单
    @RequestMapping("insertSheet")
    public Map<String, Object> insertSheet( String sheetName ) {
        int affectedRows = sheetService.insertSheet(sheetName);
        Map<String, Object> map = new HashMap<>();

        map.put("success", false);

        if (affectedRows > 0) {
            map.put("success", true);
        }
        return map;
    }
}
