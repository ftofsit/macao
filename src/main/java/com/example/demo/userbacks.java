package com.example.demo;

public class userbacks {
    private Integer id;
    private String order_id;
    private String order_name;
    private String application_time;
    private String amount;
    private String act_status;
    private String cancel;
    private String view;

    public userbacks(Integer id, String order_id, String order_name, String application_time, String amount, String act_status, String cancel, String view) {
        this.id = id;
        this.order_id = order_id;
        this.order_name = order_name;
        this.application_time = application_time;
        this.amount = amount;
        this.act_status = act_status;
        this.cancel = cancel;
        this.view = view;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    public String getApplication_time() {
        return application_time;
    }

    public void setApplication_time(String application_time) {
        this.application_time = application_time;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAct_status() {
        return act_status;
    }

    public void setAct_status(String act_status) {
        this.act_status = act_status;
    }

    public String getCancel() {
        return cancel;
    }

    public void setCancel(String cancel) {
        this.cancel = cancel;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }
}
