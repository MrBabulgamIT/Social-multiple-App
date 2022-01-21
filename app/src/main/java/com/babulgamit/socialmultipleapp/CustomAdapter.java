package com.babulgamit.socialmultipleapp;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    Context context;
    int[] images;
    String[] appsName,description;
    public static ClickListener clickListener;



    public CustomAdapter(Context context, int[] images, String[] tittle, String[] description) {
        this.context = context;
        this.images = images;
        this.appsName = tittle;
        this.description = description;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater= LayoutInflater.from(context);
        View view= layoutInflater.inflate(R.layout.sample_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.appsName.setText(appsName[position]);
        holder.discription.setText(description[position]);
        holder.imageView.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return appsName.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

        TextView appsName,discription;
        ImageView imageView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            appsName=itemView.findViewById(R.id.appsname_TextView_id);
            discription=itemView.findViewById(R.id.discriptionTextView_id);
            imageView=itemView.findViewById(R.id.imageView_id);

            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);



        }

        @Override
        public void onClick(View v) {
            clickListener.onItemClick(getAdapterPosition(),v);
        }
        @Override
        public boolean onLongClick(View v) {
            clickListener.onItemLongClick(getAdapterPosition(),v);
            return false;
        }
    }

    public interface ClickListener{

        void onItemClick(int  position, View v);
        void onItemLongClick(int  position, View v);

    }

    public void SetItemClickListener(ClickListener clickListener){

        CustomAdapter.clickListener=clickListener;

    }
}