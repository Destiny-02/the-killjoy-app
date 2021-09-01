package com.example.killjoyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

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

public class VideoPage extends Fragment {

    TextView mTitle, mDes;
    ImageView mImage;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View v = inflater.inflate(R.layout.fragment_video_page, container, false);

        mTitle = v.findViewById(R.id.title);
        mDes = v.findViewById(R.id.description);
        mImage = v.findViewById(R.id.image_view);

        Intent intent = ((Activity) getContext()).getIntent();
/*
        Intent intent = new Intent(getActivity(), Fragment.class);*/
        String title = intent.getStringExtra("title");
        String des = intent.getStringExtra("des");

        byte[] bytes = ((Activity) getContext()).getIntent().getByteArrayExtra("image");
        Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(title);

        mTitle.setText(title);
        mDes.setText(des);
        mImage.setImageBitmap(bitmap);
        // Inflate the layout for this fragment
        return v;
    }
}