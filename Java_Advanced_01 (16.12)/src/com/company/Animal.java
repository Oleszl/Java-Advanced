package com.company;

public class Animal {
    private String name;
    private String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }


    @Override
    public String toString() {
        return "" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' ;
    }
}
