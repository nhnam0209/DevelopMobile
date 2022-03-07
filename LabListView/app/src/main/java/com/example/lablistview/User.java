package com.example.lablistview;

import java.util.ArrayList;

public class User {
    private String Name;
    private String Phone;
    private int Avatar;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public int getAvatar() {
        return Avatar;
    }

    public void setAvatar(int avatar) {
        Avatar = avatar;
    }


    public ArrayList<User> getData(){
        int [] avatars = {R.drawable.ic_logo,R.drawable.ic_logo,R.drawable.ic_logo};
        String[] names = {"Nam", "Phung", "Huy"};
        String[] address = {"09015131322", "09065132131", "090141521902"};
        ArrayList <User> users = new ArrayList<>();
        for (int i = 0; i < names.length; i++){
            User u = new User();
            u.setAvatar(avatars[i]);
            u.setName(names[i]);
            u.setPhone(address[i]);
            users.add(u);
        }
        return users;
    }

}
