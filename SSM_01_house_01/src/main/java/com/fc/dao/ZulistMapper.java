package com.fc.dao;

import com.fc.bean.Zulist;
import com.fc.bean.ZulistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZulistMapper {
    long countByExample(ZulistExample example);

    int deleteByExample(ZulistExample example);

    int deleteByPrimaryKey(Integer zid);

    int insert(Zulist record);

    int insertSelective(Zulist record);

    List<Zulist> selectByExample(ZulistExample example);

    Zulist selectByPrimaryKey(Integer zid);

    int updateByExampleSelective(@Param("record") Zulist record, @Param("example") ZulistExample example);

    int updateByExample(@Param("record") Zulist record, @Param("example") ZulistExample example);

    int updateByPrimaryKeySelective(Zulist record);

    int updateByPrimaryKey(Zulist record);
}