package com.example.lablistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class UserAdapter extends ArrayAdapter<User> {

    public UserAdapter(@NonNull Context context, @NonNull ArrayList<User> objects) {
        super(context, 0, objects);
    }

    static class ViewHolder {
        TextView tvName,tvPhone;
        ImageView ivAvatar;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        User u = getItem(position);
        ViewHolder holder;

        if(convertView==null)
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_row, parent, false);
        holder = new ViewHolder();

        holder.ivAvatar = (ImageView)  convertView.findViewById(R.id.ivAvatar);
        holder.tvName = (TextView) convertView.findViewById(R.id.tvName);
        holder.tvPhone = (TextView) convertView.findViewById(R.id.tvPhone);
        convertView.setTag(holder);

//        ivAvatar.setImageAlpha(u.getAvatar());
//        tvName.setText(u.getName());
//        tvPhone.setText(u.getPhone());

        holder.tvName.setText(u.getName());
        holder.tvPhone.setText(u.getPhone());
        holder.ivAvatar.setImageAlpha(u.getAvatar());
        return convertView;
    }
}
