package com.sabbir.Stream;

public class User {
    private Integer UserID;
    private String FullName;
    private String country;

    public User(Integer userID, String fullName, String country) {
        this.UserID = userID;
        this.FullName = fullName;
        this.country = country;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserID=" + UserID +
                ", FullName='" + FullName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
