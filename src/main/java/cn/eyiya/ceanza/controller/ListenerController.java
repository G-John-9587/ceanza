package cn.eyiya.ceanza.controller;

import cn.eyiya.ceanza.listener.MyEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author G
 * @date 2019/11/15 14:33
 */
@RestController
public class ListenerController {

        @Resource
        ConfigurableApplicationContext applicationContext;

        @RequestMapping("/publish")
        public String testListener(){
            //TODO 业务处理
            applicationContext.publishEvent(new MyEvent("我在发邮件"));
            return "hahaha";
        }
}
