package com.example.demo;

public class goodsdetail {
    private Integer id;
    private String goods_img;
    private String goods_name;
    private String goods_time;
    private String goods_site;
    private String goods_price;
    private String goods_join;
    private String goods_hobby;

    public goodsdetail(Integer id, String goods_img, String goods_name, String goods_time, String goods_site, String goods_price, String goods_join, String goods_hobby) {
        this.id = id;
        this.goods_img = goods_img;
        this.goods_name = goods_name;
        this.goods_time = goods_time;
        this.goods_site = goods_site;
        this.goods_price = goods_price;
        this.goods_join = goods_join;
        this.goods_hobby = goods_hobby;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoods_img() {
        return goods_img;
    }

    public void setGoods_img(String goods_img) {
        this.goods_img = goods_img;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_time() {
        return goods_time;
    }

    public void setGoods_time(String goods_time) {
        this.goods_time = goods_time;
    }

    public String getGoods_site() {
        return goods_site;
    }

    public void setGoods_site(String goods_site) {
        this.goods_site = goods_site;
    }

    public String getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(String goods_price) {
        this.goods_price = goods_price;
    }

    public String getGoods_join() {
        return goods_join;
    }

    public void setGoods_join(String goods_join) {
        this.goods_join = goods_join;
    }

    public String getGoods_hobby() {
        return goods_hobby;
    }

    public void setGoods_hobby(String goods_hobby) {
        this.goods_hobby = goods_hobby;
    }
}
