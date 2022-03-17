package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class PersonAdapter  extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {
    private List<Person> lstPerson;
    private Context mContext;
    public PersonAdapter(Context context, List<Person> lstPerson){
        this.mContext = context;
        this.lstPerson = lstPerson;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CardView layout_item;
        ImageView ivPic, ivChat,ivCall;
        TextView tvFullName, tvPhone;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            ivPic = itemView.findViewById(R.id.ivPic);
            tvFullName = itemView.findViewById(R.id.tvFullName);
            tvPhone = itemView.findViewById(R.id.tvPhone);
            ivCall = itemView.findViewById(R.id.ivCall);
            layout_item = itemView.findViewById(R.id.layout_item);
            ivChat = itemView.findViewById(R.id.ivChat);

        }
    }

    @NonNull
    @Override

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item,parent,false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public int getItemCount() {
        if(lstPerson!=null)
            return lstPerson.size();
        return 0;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder , int position){
        Person p = lstPerson.get(position);
        if(p==null)
            return;
        holder.ivPic.setImageResource(p.getPic());
        holder.tvFullName.setText(p.getFullName());
        holder.tvPhone.setText(p.getPhone());

    }




}
