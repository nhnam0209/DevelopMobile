package com.example.recyclerview;

import java.util.ArrayList;
import java.util.List;


public class Person {
    private String fullName;
    private int Pic;
    private  String Phone;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPic() {
        return Pic;
    }

    public void setPic(int pic) {
        Pic = pic;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public static List<Person> init(){
        String[] names = {"Nam", "Phung", "Huy", "Khoa"};
        String[] phones = {"09012121", "045612384", "090315451", "09431321"};
        int[] pics = {R.drawable.ic_male, R.drawable.ic_female,R.drawable.ic_male, R.drawable.ic_male};
        Person p;
        List<Person> lstPerson = new ArrayList<>();
        for(int i =0 ; i<names.length;i++){
            p = new Person();
            p.setPic(pics[i]); p.setFullName(names[i]); p.setPhone(phones[i]);
            lstPerson.add(p);
        }
        return lstPerson;

    }
}
