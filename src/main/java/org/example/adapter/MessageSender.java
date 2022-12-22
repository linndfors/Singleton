package org.example.adapter;

import org.example.task1.User;

public class MessageSender {
    public static void send(String text, Adapter user, String country) {
        System.out.println("Message: '" + text + "' " + "from " + user.getUserMail() + "(" + country + ")" + " is sent");
    }
}
