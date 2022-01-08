package com.example.instagramapp.Model;

import java.io.Serializable;
import java.util.Date;

public class PostsModel implements Serializable {

    private String name;
    private int postPhoto;
    private int userImg;

    public PostsModel(String name, int postPhoto, int userImg) {
        this.name = name;
        this.postPhoto = postPhoto;
        this.userImg = userImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPostPhoto() {
        return postPhoto;
    }

    public void setPostPhoto(int posPphoto) {
        this.postPhoto = posPphoto;
    }

    public int getUserImg() {
        return userImg;
    }

    public void setUserImg(int userImg) {
        this.userImg = userImg;
    }
}