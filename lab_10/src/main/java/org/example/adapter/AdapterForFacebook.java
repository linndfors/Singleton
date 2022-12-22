package org.example.adapter;

import lombok.Getter;

import java.time.LocalDate;

public class AdapterForFacebook implements Adapter{
    private String userMail;
    private  String userCountry;
    private String  userLastActiveTime;
    public AdapterForFacebook(String email, Country userCountry, LocalDate getUserActiveTime) {
        this.userMail = email;
        this.userCountry = userCountry.toString();
        this.userLastActiveTime = getUserActiveTime.toString();
    }
    @Override
    public String getUserCountry() {
        return this.userCountry;
    }

    @Override
    public String getUserLastActiveTime() {
        return this.userLastActiveTime;
    }

    @Override
    public String getUserMail() {
        return this.userMail;
    }
}
