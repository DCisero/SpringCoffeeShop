package com.test.util;

public class Users {
    private String FirstName;
    private int Birthday;
    private String Email;
    private String UserName;
    private String Password;

    public Users() {
        FirstName = "";
        Birthday = 0;
        Email = "";
        UserName = "";
        Password = "";

    }
    public Users(String name, int birthday, String email, String username, String password) {
        this.FirstName = name;
        this.Birthday = birthday;
        this.Email = email;
        this.UserName = username;
        this.Password = password;
    }

    public String getFirstName() {

        return FirstName;
    }

    public void setFirstName(String FirstName) {

        this.FirstName = FirstName;
    }

    public int getBirthday() {

        return Birthday;
    }

    public void setBirthday(int Birthday) {

        this.Birthday = Birthday;
    }

    public String getEmail() {

        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUserName() {

        return UserName;
    }

    public void setUsername(String UserName) {

        this.UserName = UserName;
    }

    public String getPassword() {

        return Password;
    }

    public void setPassword(String password) {

        this.Password = Password;
    }




}
