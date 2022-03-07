package com.example.lablistview;

import java.util.ArrayList;

public class User {
    private String Name;
    private String Address;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public ArrayList<User> getData(){
        String[] names = {"Nam", "Phung", "Huy"};
        String[] address = {"Tan Binh", "Tan Binh", "Quan 7"};
        ArrayList <User> user = new ArrayList<>();
        for (int i = 0; i < names.length; i++){
            User u = new User();
            u.setName(names[i]);
            u.setAddress(address[i]);
            user.add(u);
        }
        return  user;
    }
}
