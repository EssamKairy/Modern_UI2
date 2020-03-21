package com.essam.modern_ui2;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<String> data = new ArrayList<>();
    private List<String> dates = new ArrayList<>();
    private List<Integer> imgs = new ArrayList<>();


    public Adapter(List<Integer> imgs, List<String> dates, List<String> posts) {
        this.imgs = imgs;
        this.data = posts;
        this.dates = dates;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(data.get(position));
        holder.datte.setText(dates.get(position).toString());
        holder.imageView.setImageResource(imgs.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        TextView datte;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.post);
            datte = itemView.findViewById(R.id.date);
            imageView = itemView.findViewById(R.id.p_image);

        }
    }
}
