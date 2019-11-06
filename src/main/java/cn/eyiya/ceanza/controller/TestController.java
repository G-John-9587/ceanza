package cn.eyiya.ceanza.controller;

import cn.eyiya.ceanza.model.Test;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.omg.CORBA.IDLType;
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
        //@AllArgsConstructor //所有参数的构造函数
        Test test = new Test(1L, "ttttt1");
        //@Data //get、set方法
        test.setTestName("aaaaa");
        //@Builder //
        Test test1 = Test.builder().id(2L).testName("bbbbb").build();
        return "Test spring boot";
    }
}
