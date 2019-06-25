package com.di.jav.myplayer;

import android.graphics.drawable.Drawable;

import java.time.LocalTime;

public class Song {
    private Long id;
    private String nameOfSong;
    private String performer;

    private Drawable mPicture;
    private LocalTime mDuration;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameOfSong() {
        return nameOfSong;
    }

    public void setNameOfSong(String nameOfSong) {
        this.nameOfSong = nameOfSong;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }
}
