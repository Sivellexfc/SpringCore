package models;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class SendMailListener implements ApplicationListener<SendMailEvent> {

    @Override
    public void onApplicationEvent(SendMailEvent event) {
        User user = event.getUser();
        System.out.println("Mail gönderilecek user bilgileri : "
                + user.getName() + " "
                + user.getSurname() + "\n"
                + user.getEmail() + "\n"
                + user.getPassword() + "\n");
        System.out.println("Mail bilgileri : " + "\n"
                + "Title : " + event.getTitle() + "\n"
                + "Icerik : " + event.getContent() + "\n"
                + "Kullanici : " + event.getUser().getName() + " " + event.getUser().getSurname() + "\n");
    }
}
