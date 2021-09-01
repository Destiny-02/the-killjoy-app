package com.example.killjoyapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context c;
    ArrayList<Model> models;

    public MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @NotNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_row, null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyHolder holder, int position) {

        holder.title.setText(models.get(position).getTitle());
        holder.des.setText(models.get(position).getDescription());
        holder.imageView.setImageResource(models.get(position).getImg());
        holder.videoView.loadData(models.get(position).getVideoUrl(), "text/html" , "utf-8" );

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {

                String title = models.get(position).getTitle();
                String des = models.get(position).getDescription();
                BitmapDrawable bitmapDrawable = (BitmapDrawable) holder.imageView.getDrawable();

                Bitmap bitmap = bitmapDrawable.getBitmap();

                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] bytes = stream.toByteArray();

                String url = models.get(position).getVideoUrl();

                Intent intent = new Intent(c, VideoPage.class);
                intent.putExtra("title", title);
                intent.putExtra("des", des);
                intent.putExtra("image", bytes);
                intent.putExtra("video", url);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                c.startActivity(intent);
            }
        });

        // if you want to use different , then you can use this logic
        /*holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View w, int position) {

                if (models.get(position).getTitle().equals("Front of Generator #1")) {
                    // then you can move another activity from if body
                }

                if (models.get(position).getTitle().equals("Front of Generator #2")) {
                    // then you can move another activity from if body
                }

                if (models.get(position).getTitle().equals("Left of Generator")) {
                    // then you can move another activity from if body
                }

            }
        });*/
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
