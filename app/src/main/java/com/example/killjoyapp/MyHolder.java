package com.example.killjoyapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NonNls;

public class MyHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView title, des;

    public MyHolder(@NonNull View itemView) {
        super(itemView);

        this.imageView = itemView.findViewById(R.id.image_preview_card);
        this.title = itemView.findViewById(R.id.title_card);
        this.des = itemView.findViewById(R.id.description_card);

    }

}
