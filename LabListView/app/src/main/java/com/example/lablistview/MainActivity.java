package com.example.lablistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvUser =  findViewById(R.id.lvUser);
        User user = new User();
        ArrayList<User> users = user.getData();
        UserAdapter adapter = new UserAdapter(this,users);
        lvUser.setAdapter(adapter);

    }
}