package com.example.operationmaintenancesystem.mapper;

import com.example.operationmaintenancesystem.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from User")
    public List<User> find();
}
