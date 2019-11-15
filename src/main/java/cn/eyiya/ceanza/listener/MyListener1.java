package cn.eyiya.ceanza.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;

/**
 * @author G
 * @date 2019/11/15 14:44
 * 方式一：手动装载到上下文环境中（在启动类加入context.addApplicationListener(new MyListener1());）
 */
@Slf4j
public class MyListener1 implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        log.info("{}监听到事件源：{}", MyListener1.class.getName(), myEvent.getSource());
    }
}
