package cn.eyiya.ceanza;

import cn.eyiya.ceanza.listener.MyListener1;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@ServletComponentScan
@MapperScan("cn.eyiya.ceanza.dao")
public class CeanzaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CeanzaApplication.class, args);
        //获取context，手动装载监听器到上下文环境中
        context.addApplicationListener(new MyListener1());
    }

}
