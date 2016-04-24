package cn.rookie.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;

/**
 * Created by Rookie on 2016/4/24.
 * Package name is cn.rookie.event
 * Description: 事件机制
 */
public class EmailEvent extends ApplicationEvent{

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public EmailEvent(Object source) {
        super(source);
    }
    public EmailEvent(Object source,String address,String text) {
        super(source);
        this.address = address;
        this.text = text;
    }
    private String address;
    private String text;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
