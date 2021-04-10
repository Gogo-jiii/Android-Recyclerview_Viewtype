package com.example.recyclerviewviewtype;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter {

    private ArrayList<ModelClass> arrayList;
    Context context;

    public MyAdapter(Context context, ArrayList<ModelClass> arrayList) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        switch (viewType) {

            case ModelClass.TYPE_NAME:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_name, parent, false);
                return new TextTypeViewHolder(view);

            case ModelClass.TYPE_IMAGE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_image, parent, false);
                return new ImageTypeViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ModelClass model = arrayList.get(position);
        if (model != null) {
            switch (model.getType()) {
                case ModelClass.TYPE_NAME:
                    ((TextTypeViewHolder) holder).textView.setText(model.getName());
                    break;
                case ModelClass.TYPE_IMAGE:
                    ((ImageTypeViewHolder) holder).textView2.setText(model.getName());
                    ((ImageTypeViewHolder) holder).imageView.setImageResource(model.getImage());
                    break;
            }
        }
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public int getItemViewType(int position) {
        switch (arrayList.get(position).getType()) {
            case 1:
                return ModelClass.TYPE_NAME;
            case 2:
                return ModelClass.TYPE_IMAGE;
            default:
                return -1;
        }
    }

    public static class TextTypeViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public TextTypeViewHolder(@NonNull View itemView) {
            super(itemView);

            this.textView = itemView.findViewById(R.id.textView);
        }
    }

    public static class ImageTypeViewHolder extends RecyclerView.ViewHolder {

        TextView textView2;
        ImageView imageView;

        public ImageTypeViewHolder(@NonNull View itemView) {
            super(itemView);

            textView2 = itemView.findViewById(R.id.textView2);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
