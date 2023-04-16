package com.codegym.product1.model;

public enum Status {
    INSTOCK("INSTOCK"), OUTOFSTOCK("OUTOFSTOCK");

    private String value;

    Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    public static Status contains(String s) {
        for (Status status : values()) {
            if(status.getValue().equals(s)){
                return status;
            }
        }
        return null;
    }
    public void setValue(String value) {
        this.value = value;
    }
}