package com.example.demo;
public class leave {
    private Integer id;
    private String name;
    private String userimg;
    private String title;
    private String day;

    public leave() {

// TODO Auto-generated constructor stub
    }
    public leave(Integer id, String name, String userimg, String title, String day) {
        this.id = id;
        this.name = name;
        this.userimg = userimg;
        this.title = title;
        this.day = day;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserimg() {
        return userimg;
    }

    public void setUserimg(String userimg) {
        this.userimg = userimg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}

