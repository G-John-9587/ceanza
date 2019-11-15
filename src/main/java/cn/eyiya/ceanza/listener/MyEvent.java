package cn.eyiya.ceanza.listener;

import org.springframework.context.ApplicationEvent;

/**
 * @author G
 * @date 2019/11/15 14:28
 * 事件
 */
public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source){
        super(source);
    }
}
