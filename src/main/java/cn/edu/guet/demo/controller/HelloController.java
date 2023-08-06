package cn.edu.guet.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author 1475
 * @Date 2023/8/6 19:55
 * @Version 1.0
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String Hello(){
        return "hello";
    }
}
