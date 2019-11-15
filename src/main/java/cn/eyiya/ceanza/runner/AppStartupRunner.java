package cn.eyiya.ceanza.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author G
 * @date 2019/11/15 14:14
 * 应用启动时传参方式一
 */
@Slf4j
@Component
public class AppStartupRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("ApplicationRunner参数：{}", args.getOptionNames());
        log.info("ApplicationRunner参数：{}", args.getOptionValues("name"));
    }
}
