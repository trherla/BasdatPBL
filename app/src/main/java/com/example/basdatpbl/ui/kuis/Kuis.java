package com.example.basdatpbl.ui.kuis;

public class Kuis {
    private String Title;
    private int Thumbnail;

    public Kuis(String title, int thumbnail) {
        Title = title;
        Thumbnail = thumbnail;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getThumbnail() {
        return Thumbnail;
    }


}
