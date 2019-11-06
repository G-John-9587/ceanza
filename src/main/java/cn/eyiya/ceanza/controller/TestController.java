package cn.eyiya.ceanza.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author G
 * @date 2019/11/6 14:14
 */

@RestController
public class TestController {

    @RequestMapping("/test")
    public String Test(){
        return "Test spring boot";
    }
}
