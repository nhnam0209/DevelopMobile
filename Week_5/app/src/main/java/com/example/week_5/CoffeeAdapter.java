package com.example.week_5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CoffeeAdapter extends RecyclerView.Adapter<CoffeeAdapter.ViewHolder> {
    private List<Coffee> lstCoffee;
    private  Context mContext;
    public CoffeeAdapter(Context context, List<Coffee> lstCoffee){
        this.mContext = context;
        this.lstCoffee = lstCoffee;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CardView layout_item;
        ImageView ivPic, ivFavor, ivAdd, ivRemove;
        TextView tvCoffeeName, tvPrice;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            layout_item = itemView.findViewById(R.id.layout_item);
            ivPic = itemView.findViewById(R.id.ivPic);
            ivFavor = itemView.findViewById(R.id.ivFavor);
            ivAdd = itemView.findViewById(R.id.ivAdd);
            ivRemove = itemView.findViewById(R.id.ivRemove);
            tvCoffeeName = itemView.findViewById(R.id.tvCoffeeName);
            tvPrice = itemView.findViewById(R.id.tvPrice);
        }
    }

    @NonNull
    @Override
    public CoffeeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent,false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CoffeeAdapter.ViewHolder holder, int position) {
        Coffee c = lstCoffee.get(position);
        if(c == null)
            return;
        holder.ivPic.setImageResource(c.getPic());
        holder.tvCoffeeName.setText(c.getCoffeeName());
        holder.tvPrice.setText(c.getPrice());

    }

    @Override
    public int getItemCount() {
        if(lstCoffee!=null)
            return lstCoffee.size();
        return 0;
    }
}
