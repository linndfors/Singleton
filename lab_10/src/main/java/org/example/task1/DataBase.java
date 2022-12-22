package org.example.task1;

import java.sql.*;

public class DataBase {
    private static DataBase instance;
    public DataBase() {
        try {
            Class.forName("org.sqlite.JDBC");
            String dbURL = "jdbc:sqlite:user_info.db";
            Connection conn = DriverManager.getConnection(dbURL);
            String sql = "create table user_info (name varchar(20), email varchar(20), age varchar(20))";
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
        }
        catch (Exception ex) {
        }
    }

    public static DataBase getInstance() {
        if (instance == null) {
            DataBase.instance = new DataBase();
        }
        return DataBase.instance;
    }

    public static void save(User user) {
        try {
            Class.forName("org.sqlite.JDBC");
            String dbURL = "jdbc:sqlite:user_info.db";
            Connection conn = DriverManager.getConnection(dbURL);
            PreparedStatement statement1 = conn.prepareStatement("insert into user_info values(?, ?, ?);");
            statement1.setString(1, user.getEmail());
            statement1.setString(2, user.getName());
            statement1.setInt(3, user.getAge());
            statement1.addBatch();
            conn.setAutoCommit(false);
            statement1.executeBatch();
            conn.setAutoCommit(true);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
