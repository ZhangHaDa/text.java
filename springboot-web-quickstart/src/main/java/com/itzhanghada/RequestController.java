package com.itzhanghada;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @RequestMapping("/request")
    public String request(HttpServletRequest request){
        String method = request.getMethod();
        System.out.println("请求方式: "+method);
        int i = 1/0;

        StringBuffer url = request.getRequestURL();
        System.out.println("请求链接: "+url);

        String uri = request.getRequestURI();
        System.out.println("请求名字: "+uri);

        String protocol = request.getProtocol();
        System.out.println("请求协议: "+protocol);

        String name = request.getParameter("name");
        System.out.println("名字: "+name);

        String age = request.getParameter("age");
        System.out.println("年龄: "+age);

        String header = request.getHeader("Accept");
        System.out.println("Accept: "+header);
        return "OK";
    }
}
