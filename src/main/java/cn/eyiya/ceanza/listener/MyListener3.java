package cn.eyiya.ceanza.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;

/**
 * @author G
 * @date 2019/11/15 14:49
 * 方式三： 配置文件方式，在配置文件中加入
 */
@Slf4j
public class MyListener3 implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        //TODO 发送邮件的代码
        log.info("{}监听到事件源：{}", MyListener3.class.getName(), myEvent.getSource());
    }
}
