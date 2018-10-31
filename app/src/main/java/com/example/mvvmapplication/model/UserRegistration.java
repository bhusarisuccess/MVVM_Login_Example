package com.example.mvvmapplication.model;

import android.text.TextUtils;
import android.util.Patterns;

public class UserRegistration {
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private String phoneNumber;

    public UserRegistration(String userName, String email, String password, String confirmPassword, String phoneNumber) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public boolean isInputDataValid() {
        return !TextUtils.isEmpty(getUserName()) && Patterns.PHONE.matcher(getPhoneNumber()).matches() && Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() && getPassword().length() > 5 && getConfirmPassword().length() > 5&& getPassword().equals(getConfirmPassword());
    }
}
