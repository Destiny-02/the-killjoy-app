package com.example.killjoyapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.net.URL;

public class VideoPage extends AppCompatActivity {

    TextView mTitle, mDes;
    YouTubePlayerView mVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_page);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        mTitle = findViewById(R.id.title);
        mDes = findViewById(R.id.description);
        mVideo = findViewById(R.id.video_web_view);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String des = intent.getStringExtra("des");
        String url = intent.getStringExtra("video");

        actionBar.setTitle(title);

        mTitle.setText(title);
        mDes.setText(des);
        getLifecycle().addObserver(mVideo);
        mVideo.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = url;
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
            overridePendingTransition(0, 0);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}