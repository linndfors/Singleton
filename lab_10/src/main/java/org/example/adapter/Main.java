package org.example.adapter;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FacebookUser user1 = new FacebookUser("new@gmail.com", Country.Ukraine, LocalDate.now());
        AdapterForFacebook new_user1 = new AdapterForFacebook(user1.getEmail(), user1.getUserCountry(), user1.getGetUserActiveTime());

        MessageSender send_mess = new MessageSender();
        boolean registration = Login.login(new_user1);
        if (registration) {
            send_mess.send("Hello", new_user1, new_user1.getUserCountry());
        }

        TwitterUser user2 = new TwitterUser("meow@gmail.com", "Ukraine", "2022-12-22");
        AdapterForTwitter new_user2 = new AdapterForTwitter(user2.getUserMail(), user2.getCountry(), user2.getLastActiveTime());

        MessageSender send_mess1 = new MessageSender();
        boolean registration1 = Login.login(new_user2);
        if (registration1) {
            send_mess1.send("Hello world", new_user2, new_user2.getUserCountry());
        }
    }
}
