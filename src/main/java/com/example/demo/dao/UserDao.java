package com.example.demo.dao;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


/**
 * @author by HZL
 * @date 2019/12/3 16:14
 * @description
 */
@Mapper
@Repository
public interface UserDao {
    /**
     * @param id
     * @return
     */
    @Select("select * from user where id=#{id}")
    User getById(@Param("id") int id);
}
