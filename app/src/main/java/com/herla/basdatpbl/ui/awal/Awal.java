package com.herla.basdatpbl.ui.awal;

public class Awal {
    private String Title;
    private String Description;
    private int Thumbnail;

    public Awal(String title, String description, int thumbnail) {
        Title = title;
        Description = description;
        Thumbnail = thumbnail;
    }
    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }

}
