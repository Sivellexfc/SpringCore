package models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;

import java.time.Clock;

public class SendMailEvent extends ApplicationEvent {

    private String title;
    private String content;
    private User user;

    public SendMailEvent(User user,String title,String content) {
        super(user);
        this.content = content;
        this.title = title;
        this.user = user;
    }

    public SendMailEvent(Object source) {
        super(source);
    }

    public SendMailEvent(Object source, Clock clock) {
        super(source, clock);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "SendMailEvent{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", user=" + user +
                '}';
    }
}
