package com.herla.basdatpbl.ui.kasus;

public class Kasus {
    private String Title;

    private int Thumbnail;

    public Kasus(String title,  int thumbnail) {
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

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }


}
