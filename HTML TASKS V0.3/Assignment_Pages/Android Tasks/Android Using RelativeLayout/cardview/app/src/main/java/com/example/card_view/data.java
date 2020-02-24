package com.example.card_view;

public class data {
    private int Image;
    private String Name;



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public data(int image, String name)
    {
        Image=image;
        this.Name=name;

    }
}
