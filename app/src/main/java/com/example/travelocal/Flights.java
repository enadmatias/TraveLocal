package com.example.travelocal;

public class Flights {
    private int photo;
    private String place, price;

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Flights(int photo, String place, String price) {
        this.photo = photo;
        this.place = place;
        this.price = price;
    }
}
