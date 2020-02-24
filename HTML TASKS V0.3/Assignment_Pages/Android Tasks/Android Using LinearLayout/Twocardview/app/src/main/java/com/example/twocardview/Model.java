package com.example.twocardview;

public class Model {
    private  String text1;
    private int type;
    public static final int ONE_TYPE=1;
    public static final int TWO_TYPE=2;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Model(String text1, int type) {
        this.text1 = text1;
        this.type=type;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }


}
