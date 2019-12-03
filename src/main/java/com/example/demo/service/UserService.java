package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


/**
 * @author by HZL
 * @date 2019/12/3 16:19
 * @description
 */
@Service
@Slf4j
public class UserService {
    @Autowired
    private UserDao userDao;


    /**
     * 通过id查询用户,进行缓存
     * @param id
     * @return
     */
    @Cacheable(cacheNames = "user", key = "#id")
    public User getById(Integer id){
        User user = userDao.getById(id);
        return user;
    }

}
