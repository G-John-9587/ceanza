package cn.eyiya.ceanza.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author G
 * @date 2019/11/15 14:53
 * 方式四：不实现ApplicationListener。直接用@EventListener方式
 */
@Slf4j
@Component
public class MyListener4 {
    @EventListener
    public void listener(MyEvent myEvent){
        //TODO 发送邮件的代码
        log.info("{}监听到事件源：{}", MyListener4.class.getName(), myEvent.getSource());
    }
}
