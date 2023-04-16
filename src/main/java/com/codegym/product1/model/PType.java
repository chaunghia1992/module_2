package com.codegym.product1.model;

public enum PType {
    sunsilk("sunsilk"), clearMen("clearMen"), Romano("Romano"),dove("dove"), lifebuoy("lifebuoy");
    private String value;

    PType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static boolean fromValue(String value) {
        PType[] values = values();
        for (PType type : values) {
            if (type.value.equals(value))
                return true;
        }

        return false;
    }

    public static PType contains(String type) {
        for (PType type1 : values()) {
            if(type1.getValue().equals(type)){
                return type1;
            }
        }
        return null;
    }

    public boolean equalsIgnoreCase(String other) {
        return this.toString().equalsIgnoreCase(other);
    }


}