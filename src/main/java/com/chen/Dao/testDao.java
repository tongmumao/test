package com.chen.Dao;

import com.chen.Pojo.test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface testDao {

    @Select("select * from test")
    public List<test> findAll();

    @Select("select * from test where id=#{id}")
    public List<test> findById(Integer id);
}
