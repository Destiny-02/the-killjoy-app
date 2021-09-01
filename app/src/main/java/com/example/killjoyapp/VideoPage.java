package com.example.killjoyapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class VideoPage extends AppCompatActivity {

    TextView mTitle, mDes;
    ImageView mImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_page);

        mTitle = findViewById(R.id.title);
        mDes = findViewById(R.id.description);
        mImage = findViewById(R.id.image_view);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String des = intent.getStringExtra("des");

        byte[] bytes = getIntent().getByteArrayExtra("image");
        Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);

       /* ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(title);*/

        mTitle.setText(title);
        mDes.setText(des);
        mImage.setImageBitmap(bitmap);
    }
}