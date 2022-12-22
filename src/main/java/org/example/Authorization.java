package org.example;


public class Authorization {
    public boolean authorize(DataBase db) {
        db.getUserInfo();
        return true;
    }
}
