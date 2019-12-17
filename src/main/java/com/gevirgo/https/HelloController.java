package com.gevirgo.https;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author ding.liangliang
 * @Date 2019/12/17 9:47
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello https";
    }
}
