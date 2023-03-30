package com.codegym.client;

import java.util.Date;

public class client {
    private long id;
    private String name;
    private String email;
    private String address;
    private Date entryDate;
public client(){}
    public client(long id, String name, String email, String address, Date entryDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.entryDate = entryDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }
}



