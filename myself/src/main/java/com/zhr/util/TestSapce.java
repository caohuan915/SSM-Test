package com.zhr.util;

import com.zhr.mapper.Usermapper;
import com.zhr.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.testng.annotations.Test;

public class TestSapce {
    public static void main(String[] args) {

    }
    public static SqlSession getSqlSession(){
        SqlSession sqlSession = null;
        try {
            InputStream inputstream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputstream);
            sqlSession = sqlSessionFactory.openSession(true);

        }catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSession;
    }
@Test
    public void insert(){
        SqlSession sqlSession = getSqlSession();
        Usermapper usermapper = sqlSession.getMapper(Usermapper.class);
        List<User> list = usermapper.getcolumn();
        System.out.println(list);
    }

    public void obscure(){

    }
}
