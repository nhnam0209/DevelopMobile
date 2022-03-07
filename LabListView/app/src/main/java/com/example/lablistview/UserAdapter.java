package com.example.lablistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class UserAdapter extends ArrayAdapter<User> {

    public UserAdapter(@NonNull Context context, @NonNull ArrayList<User> objects){
        super(context,0,objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        User u = getItem(position);
        if(convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_row,parent,false);
        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvAddress = convertView.findViewById(R.id.tvAddress);
        tvName.setText(u.getName());
        tvAddress.setText(u.getAddress());
        return convertView;
    }
}
