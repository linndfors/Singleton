package org.example;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Authorization auto = new Authorization();
        if (auto.authorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
