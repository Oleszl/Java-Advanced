package com.company;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String fullName;
    private String address;
    private int age;

    private List<Animal> animalList;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void addAnimalToList(Animal animal){
        animalList.add(animal);
    }
    public void removeAnimalFromList(Animal animal){
        animalList.remove(animal);
    }

    public User(String fullName, String address, int age) {
        this.fullName = fullName;
        this.address = address;
        this.age = age;
        animalList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", animal:" + animalList +
                '}';
    }

    public boolean ageCheck(){
        if (this.age>=18)
            return true;
        else
            return false;
    }
}
