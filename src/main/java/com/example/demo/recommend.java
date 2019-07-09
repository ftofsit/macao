package com.example.demo;

public class recommend {
    private Integer id;
    private String goods_name;
    private String goods_img;
    private String goods_time;
    private String goods_addr;
    private String goods_price;
    private String goods_url;

    public recommend(){

    // TODO Auto-generated constructor stub

    }

    public recommend(Integer id, String goods_name, String goods_img, String goods_time, String goods_addr, String goods_price, String goods_url) {
        this.id = id;
        this.goods_name = goods_name;
        this.goods_img = goods_img;
        this.goods_time = goods_time;
        this.goods_addr = goods_addr;
        this.goods_price = goods_price;
        this.goods_url = goods_url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_img() {
        return goods_img;
    }

    public void setGoods_img(String goods_img) {
        this.goods_img = goods_img;
    }

    public String getGoods_time() {
        return goods_time;
    }

    public void setGoods_time(String goods_time) {
        this.goods_time = goods_time;
    }

    public String getGoods_addr() {
        return goods_addr;
    }

    public void setGoods_addr(String goods_addr) {
        this.goods_addr = goods_addr;
    }

    public String getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(String goods_price) {
        this.goods_price = goods_price;
    }

    public String getGoods_url() {
        return goods_url;
    }

    public void setGoods_url(String goods_url) {
        this.goods_url = goods_url;
    }
}
