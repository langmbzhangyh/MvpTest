package com.example.lang.mvptest.bean;

/**
 * Created by lang on 2017/8/30.
 */

public class Student {
    //学生的名字
    private String name;
    //学生的图片信息
    private int image;

    public Student(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
