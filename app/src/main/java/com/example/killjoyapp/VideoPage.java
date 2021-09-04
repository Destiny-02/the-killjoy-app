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

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class VideoPage extends AppCompatActivity {

    TextView mTitle, mDes;
    WebView mVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_page);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        mTitle = findViewById(R.id.title);
        mDes = findViewById(R.id.description);
        mVideo = findViewById(R.id.video_web_view);
        mVideo.getSettings().setJavaScriptEnabled(true);
        mVideo.getSettings().setDomStorageEnabled(true);

        mVideo.setWebChromeClient(new WebChromeClient() {
        } );

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String des = intent.getStringExtra("des");
        String url = intent.getStringExtra("video");

        actionBar.setTitle(title);

        mTitle.setText(title);
        mDes.setText(des);
        mVideo.loadUrl(url);
        mVideo.setWebViewClient(new loadWebView());
    }

    private class loadWebView extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
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