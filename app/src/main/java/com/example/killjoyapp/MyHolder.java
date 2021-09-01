package com.example.killjoyapp;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView imageView;
    TextView title, des;
    ItemClickListener itemClickListener;
    WebView videoView;

    MyHolder(@NonNull View itemView) {
        super(itemView);

        this.imageView = itemView.findViewById(R.id.image_preview_card);
        this.title = itemView.findViewById(R.id.title_card);
        this.des = itemView.findViewById(R.id.description_card);
        this.videoView = itemView.findViewById(R.id.video_web_view_card);

        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        this.itemClickListener.onItemClickListener(view, getLayoutPosition());


    }

    public void setItemClickListener(ItemClickListener ic) {

        this.itemClickListener = ic;
    }
}
