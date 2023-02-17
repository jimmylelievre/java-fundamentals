package fr.aelion.models;

public class Student {
    public String lastName;
    public String firstName;
    private String username;
    private String email;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    private String password;
    private Boolean isLoggedIn = false;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Student() {
    }

    public Student(String lastName, String firstName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public boolean login(String username, String password) {


        if (this.username.equals(username) && this.password.equals(password)) {
            this.isLoggedIn = true;
            return true;
        }
        return false;

    }

    public void logout() {
        this.isLoggedIn = false;

    }

    public boolean isLoggedIn() {
        return this.isLoggedIn;
    }
}
