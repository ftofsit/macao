package com.example.demo;

public class bonus {
    private Integer id;
    private String name;
    private String amount;
    private String minamount;
    private String status;

    public bonus(Integer id, String name, String amount, String minamount, String status) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.minamount = minamount;
        this.status = status;
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getMinamount() {
        return minamount;
    }

    public void setMinamount(String minamount) {
        this.minamount = minamount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
