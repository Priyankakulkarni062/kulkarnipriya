package com.example.project_myrequsetpage;

public class data {
    private int Image;
    private String Name;

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public data(int image, String name) {
        Image = image;
        Name = name;
    }


}
