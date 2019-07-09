package com.example.demo;

public class contents {
    private Integer id;
    private String name;
    private String content;
    private String time;

    public contents() {

// TODO Auto-generated constructor stub
    }
    public contents(Integer id, String name, String content, String time) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.time = time;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


}
