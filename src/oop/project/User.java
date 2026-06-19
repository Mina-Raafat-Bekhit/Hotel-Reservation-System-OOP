package oop.project;

public abstract class User {
    String username;

    public abstract void displayInfo();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
