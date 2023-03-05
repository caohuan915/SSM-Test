package com.zhr.mapper;

import com.zhr.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Usermapper {
    void insertData();
    List<User> mohufind(@Param("mohu") String mohu);

    List<User> find(@Param("workshop") String one);
    List<User> getcolumn();
}
