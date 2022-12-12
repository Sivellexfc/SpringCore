package models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class SendMailPublisher {

    private final ApplicationEventPublisher applicationEventPublisher;

    public SendMailPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void userRegistryMessage(){
        User user = new User("siv@gmail.com","1q2w3e4","Musluhan","Cavus");
        SendMailEvent event = new SendMailEvent(user,"Yeni kayıt","Kaydınız başarıyla tamamlandı");

        this.applicationEventPublisher.publishEvent(event);

    }

}
