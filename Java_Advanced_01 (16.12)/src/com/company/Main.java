package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal("Black", "Dog");
        User user1 = new User("Oles Sukmanovskyi", "Zolochiv", 19);

        Animal animal2 = new Animal("White", "Cat");
        User user2 = new User("Nazar Kovalchuk", "Lviv", 20);

        user1.addAnimalToList(animal1);
        user1.addAnimalToList(animal2);
        System.out.println(user1.ageCheck());


        user2.addAnimalToList(animal2);
        user2.removeAnimalFromList(animal2);

        System.out.println(user2);
    }
}
