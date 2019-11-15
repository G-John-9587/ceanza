package cn.eyiya.ceanza.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.security.PublicKey;
import java.util.Arrays;

/**
 * @author G
 * @date 2019/11/15 14:19
 * 启动时传参方式二，定义执行顺序
 */
@Configuration
public class BeanRunner {
    @Bean
    @Order(1)
    public CommandLineRunner runner1(){
        return new CommandLineRunner() {
            public void run(String... args) {
                System.out.println("CommandLineRunner run1()" + Arrays.toString(args));
            }
        };
    }

    @Bean
    @Order(2)
    public CommandLineRunner runner2(){
        return new CommandLineRunner() {
            public void run(String... args) {
                System.out.println("CommandLineRunner run2()" + Arrays.toString(args));
            }
        };
    }

    @Bean
    @Order(3)
    public CommandLineRunner runner3(){
        return new CommandLineRunner() {
            public void run(String... args) {
                System.out.println("CommandLineRunner run3()" + Arrays.toString(args));
            }
        };
    }
}
