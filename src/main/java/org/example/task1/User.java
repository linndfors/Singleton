package org.example.task1;

import lombok.Getter;

@Getter
public class User {
    private static DataBase db = DataBase.getInstance();
    private int id;
    private String name;
    private String email;
    private int age;

    public User(int id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public static void main(String[] args) {
        User user1 = new User(2, "Oleh", "dfegbfmgn@gmail.com", 91);
        db.save(user1);
        User user2 = new User(3, "Lida", "dhrfhb@gmail.com", 67);
        db.save(user2);
    }
}
