package com.chengang.ws.demo1.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陈刚
 * @ClassName HelloWorld
 * @Description //TODO
 * @create 2019-08-29 22:17
 */
@RestController
@RequestMapping("/hello")
public class HelloWorld {

    @GetMapping("/world")
    public String world() {
        return "hello world";
    }
}
