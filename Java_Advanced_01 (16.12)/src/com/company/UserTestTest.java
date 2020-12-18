package com.company;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserTestTest {

    private User user;
    private Animal animal;

    @BeforeEach
    public void creatNewUser() {
        user = new User("Oles Sukmanovskyi", "Zolochiv", 18);
    }

    public void createNewAnimal() {
        animal = new Animal("Pet", "Pet");
    }

    @Test
    public void userShoudBeOverEighteen() {
        Assertions.assertTrue(user.getAge() >= 18, String.valueOf(user.getAge()));
    }

    @Test
    public void addressShouldBeAddedToUser() {
        String address = "Lviv";
        user.setAddress(address);
        Assertions.assertTrue(user.getAddress().contains(address));
    }

    @Test
    public void animalShouldBeAddedToList() {
        user.addAnimalToList(animal);
        Assertions.assertTrue(user.getAnimalList().contains(animal));
    }

    @Test
    public void fullNameShouldBeEdited() {
        String fullName = "Oleg Bodnar";
        user.setFullName(fullName);
        assertEquals(fullName, user.getFullName());
    }
    @Test
    public void addressShouldBeDeleted() {
        user.setAddress(null);
        assertNull(user.getAddress());

    }

    @Test
    public void animalShouldBeDeletedFromList() {
        user.addAnimalToList(animal);
        user.removeAnimalFromList(animal);
        assertFalse(user.getAnimalList().contains(animal));
    }


}