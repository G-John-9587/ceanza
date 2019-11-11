package cn.eyiya.ceanza;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.eyiya.ceanza.dao")
public class CeanzaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CeanzaApplication.class, args);
    }

}
