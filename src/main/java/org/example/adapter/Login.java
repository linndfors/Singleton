package org.example.adapter;

import java.util.Objects;

public class Login {
    public static boolean login(Adapter user) {
        if (Objects.equals(user.getUserCountry().toString(), "Ukraine")) {
            return true;
        }
        return false;
    }
}
