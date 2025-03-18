package com.itzhanghada.controller;

import cn.hutool.core.io.IoUtil;
import com.itzhanghada.pojo.User;
import com.itzhanghada.service.UserService;
import com.itzhanghada.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 *用户信息的controller
 *
 */

@RestController
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public List<User> list() throws FileNotFoundException {
     /*   //1.加载读写user.txt中的文件
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
        ArrayList<String> lines = IoUtil.readLines(in, StandardCharsets.UTF_8, new ArrayList<>());


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

        //3.返回数据
        return userlist;*/

        List<User> userlist = userService.findAll();


        //3.返回数据
        return userlist;
    }

}
