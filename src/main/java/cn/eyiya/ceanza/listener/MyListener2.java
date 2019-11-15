package cn.eyiya.ceanza.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author G
 * @date 2019/11/15 14:31
 * 方式二：注解方式@Component
 */
@Component
@Slf4j
public class MyListener2 implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        //TODO 发送邮件的代码
        log.info("{}监听到事件源：{}", MyListener2.class.getName(), myEvent.getSource());
    }
}
