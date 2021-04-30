package com.fc.dao;

import com.fc.bean.Houselist;
import com.fc.bean.HouselistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouselistMapper {
    long countByExample(HouselistExample example);

    int deleteByExample(HouselistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Houselist record);

    int insertSelective(Houselist record);

    List<Houselist> selectByExample(HouselistExample example);

    Houselist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Houselist record, @Param("example") HouselistExample example);

    int updateByExample(@Param("record") Houselist record, @Param("example") HouselistExample example);

    int updateByPrimaryKeySelective(Houselist record);

    int updateByPrimaryKey(Houselist record);
}