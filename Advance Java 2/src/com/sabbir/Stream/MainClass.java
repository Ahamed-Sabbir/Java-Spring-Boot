package com.sabbir.Stream;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        User user1 = new User(1, "Samia", "Bangladesh");
        User user2 = new User(2, "Sabbir", "Bangladesh");
        User user3 = new User(3, "Tisha", "England");
        User user4 = new User(4, "Haque", "Ireland");

        List<User> UserList= new ArrayList<>();
        UserList.add(user1);
        UserList.add(user2);
        UserList.add(user3);
        UserList.add(user4);

        // select all bangladeshi user
        List<User> Bangladeshi = UserList.stream().filter((user) -> {
           if(user.getCountry().equals("Bangladesh")) {
               return true;
           }
           return false;
        }).toList();
        System.out.println(Bangladeshi);

        // get the names of all bangladeshi user
        List<String> NameOfBangladeshiUser = UserList.stream().map((user) -> {
            if(user.getCountry().equals("Bangladesh")) {
                return user.getFullName();
            }
            else {
                return null;
            }
        }).filter((name) -> name != null).toList();
        System.out.println(NameOfBangladeshiUser);

        // get the names of bangladeshi user and set their name to name+userid
        List<User> UpdatedUserName = UserList.stream().map((user) -> {
            if(user.getCountry().equals("Bangladesh")) {
                user.setFullName(user.getFullName() + "-" + user.getUserID());
                return user;
            }
            else {
                return null;
            }
        }).filter((UpdatedName) -> UpdatedName != null).toList();
        System.out.println(UpdatedUserName);
    }
}
