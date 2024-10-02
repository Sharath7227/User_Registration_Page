package com.registration.firsts.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Cache;

@Entity
@Table(name="user_details")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Sl")
    private Long id;
    @Column(name = "User_Name")
    private String username; // Name
    @Column(name = "Email")
    private String email;
    @Column(name = "Phone_Number")
    private String phoneNumber; // Phone No.
    @Column(name = "Password")
    private String password;
    @Column(name = "Gender")
    private String gender; // Male or Female

    // Default constructor
    public User() {}

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public void setUserId(String id) {
        this.id = Long.valueOf(id);
    }
}
