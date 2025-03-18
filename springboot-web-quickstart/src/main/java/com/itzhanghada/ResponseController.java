package com.itzhanghada;


import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ResponseController {

    @RequestMapping("/response")
    public void response(HttpServletResponse response) throws IOException {
//        response.setStatus(HttpServletResponse.SC_OK);
        response.setHeader("name","zhanghada");

        response.getWriter().write("<h1> response <h1>");

    }
    @RequestMapping("/response2")
    public ResponseEntity<String> response2(){
        return ResponseEntity
                .status(401)
                .header("name","zhanghada")
                .body("<h1> hello response <h1>");
    }
}
