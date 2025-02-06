package com.example.shop;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Contact extends RecyclerView.Adapter<Contact.ViewHolder> {
     Context context;
     ArrayList<Model> list ;
    public  Contact(Context context,ArrayList<Model>list){
        this.context=context;
        this.list=list;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
         holder.imageView.setImageResource(list.get(position).img);
         holder.textView.setText(list.get(position).txt);
         holder.itemView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(context, MainActivity4.class);
                 intent.putExtra("img",list.get(holder.getAdapterPosition()).img);
                 intent.putExtra("txt",list.get(holder.getAdapterPosition()).txt);
                 context.startActivity(intent);
             }
         });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public ViewHolder(View itemview){
            super(itemview);
            imageView = itemview.findViewById(R.id.c);
            textView=itemview.findViewById(R.id.d);
        }
    }


}
