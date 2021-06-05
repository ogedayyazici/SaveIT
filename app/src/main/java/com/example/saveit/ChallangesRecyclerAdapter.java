package com.example.saveit;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class ChallangesRecyclerAdapter extends RecyclerView.Adapter<ChallangesRecyclerAdapter.MyViewHolder> {

    String data1[], data2[];
    int img[];
    Context context;
    Button btn;


    public ChallangesRecyclerAdapter(Context ct, String s1[], String s2[], int images[]){
        context=ct;
        data1=s1;
        data2=s2;
        img=images;

    }
    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.my_challenges_recycler,parent,false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myImage.setImageResource(img[position]);

        holder.deleteimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.myImage.setImageResource(R.drawable.circle_tick);
                }
        });

    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView myText1,myText2;
        ImageView myImage,deleteimg;

        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            myText1=itemView.findViewById(R.id.title);
            myText2=itemView.findViewById(R.id.desc);
            myImage=itemView.findViewById(R.id.img);
            btn=(Button)itemView.findViewById(R.id.done);
            deleteimg=itemView.findViewById(R.id.delete);

        }
    }
}