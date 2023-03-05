package com.zhenghuanrong.util;

import com.zhenghuanrong.mapper.empMapper;
import com.zhenghuanrong.pojo.emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test{
    public static void main(String[] args) {

    }
    public static SqlSession getSqlSession() {
        SqlSession sqlSession = null;
        try {
            InputStream inputstream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputstream);
            sqlSession = sqlSessionFactory.openSession(true);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSession;
    }
    @Test
    public void select(){
        SqlSession sqlSession = getSqlSession();
        empMapper emp1 = sqlSession.getMapper(empMapper.class);
        emp emps = emp1.selectByPrimaryKey(3);
        System.out.println(emps);
    }

}
