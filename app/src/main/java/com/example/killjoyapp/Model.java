package com.example.killjoyapp;

public class Model {

    private String title, description, url;
    private int img;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setVideoUrl(String url) {
        this.url = url;
    }
    public String getVideoUrl() {
        return this.url;
    }
}
