package org.example;

public class DbSetting {

    private String name;
    private String password;

    public DbSetting(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName(String name) {
        return name;
    }

    public String getPassword(String password) {
        return password;
    }
}
