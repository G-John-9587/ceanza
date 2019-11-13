package cn.eyiya.ceanza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class CeanzaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CeanzaApplication.class, args);
    }

}
