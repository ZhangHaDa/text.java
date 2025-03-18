package com.itzhanghada.service.impl;

import com.itzhanghada.dao.UserDao;
import com.itzhanghada.dao.impl.UserDaoImpl;
import com.itzhanghada.pojo.User;
import com.itzhanghada.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAll() {
        //1.调用Dao
        List<String> lines = userDao.findAll();

        //2.解析用户信息,封装user
        List<User> userlist = lines.stream().map(line -> {
            String[] arr = line.split(",");
            Integer id = Integer.parseInt(arr[0]);
            String username = arr[1];
            String password = arr[2];
            String name = arr[3];
            Integer age = Integer.parseInt(arr[4]);
            LocalDateTime updateTime = LocalDateTime.parse(arr[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return new User(id, username, password, name, age, updateTime);
        }).toList();

        return userlist;
    }
}
