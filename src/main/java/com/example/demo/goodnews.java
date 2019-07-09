package com.example.demo;

public class goodnews {
    private Integer id;
    private String orderno;
    private String dealtime;
    private String goods_img;
    private String goods_name;
    private String goods_act;
    private String goods_price;
    private String goods_num;
    private String goods_order;
    private String goods_id;
    private String goods_prices;
    private String goods_status;
    private String order_url;
    private String order;

    public goodnews(Integer id, String orderno, String dealtime, String goods_img, String goods_name, String goods_act, String goods_price, String goods_num, String goods_order, String goods_id, String goods_prices, String goods_status, String order_url, String order) {
        this.id = id;
        this.orderno = orderno;
        this.dealtime = dealtime;
        this.goods_img = goods_img;
        this.goods_name = goods_name;
        this.goods_act = goods_act;
        this.goods_price = goods_price;
        this.goods_num = goods_num;
        this.goods_order = goods_order;
        this.goods_id = goods_id;
        this.goods_prices = goods_prices;
        this.goods_status = goods_status;
        this.order_url = order_url;
        this.order = order;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public String getDealtime() {
        return dealtime;
    }

    public void setDealtime(String dealtime) {
        this.dealtime = dealtime;
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

    public String getGoods_act() {
        return goods_act;
    }

    public void setGoods_act(String goods_act) {
        this.goods_act = goods_act;
    }

    public String getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(String goods_price) {
        this.goods_price = goods_price;
    }

    public String getGoods_num() {
        return goods_num;
    }

    public void setGoods_num(String goods_num) {
        this.goods_num = goods_num;
    }

    public String getGoods_order() {
        return goods_order;
    }

    public void setGoods_order(String goods_order) {
        this.goods_order = goods_order;
    }

    public String getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(String goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_prices() {
        return goods_prices;
    }

    public void setGoods_prices(String goods_prices) {
        this.goods_prices = goods_prices;
    }

    public String getGoods_status() {
        return goods_status;
    }

    public void setGoods_status(String goods_status) {
        this.goods_status = goods_status;
    }

    public String getOrder_url() {
        return order_url;
    }

    public void setOrder_url(String order_url) {
        this.order_url = order_url;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}