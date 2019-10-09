package com.example.recyclerview.model;

public class MovieModel {
    String name;
    String rating;
    String jadwal;
    String DesCription;

    public MovieModel(String name, String rating, String jadwal, String desCription) {
        this.name = name;
        this.rating = rating;
        this.jadwal = jadwal;
        this.DesCription = desCription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    public String getDesCription() {
        return DesCription;
    }

    public void setDesCription(String desCription) {
        DesCription = desCription;
    }



}
