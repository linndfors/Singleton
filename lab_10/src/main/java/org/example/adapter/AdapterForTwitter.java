package org.example.adapter;

import lombok.Getter;

public class AdapterForTwitter extends TwitterUser implements Adapter{
    private String userMail;
    private String userCountry;
    private String  userLastActiveTime;
    public AdapterForTwitter(String userMail, String country, String lastActiveTime) {
        super(userMail, country, lastActiveTime);
        this.userMail = userMail;
        this.userCountry = country;
        this.userLastActiveTime = lastActiveTime;
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
