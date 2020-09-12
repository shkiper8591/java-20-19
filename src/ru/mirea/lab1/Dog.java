package ru.mirea.lab1;

public class Dog {
    public String nameDog;
    public int age;
    public String species;


    public Dog(String name, int age, String species) {
        this.nameDog = nameDog;
        this.age = age;
        this.species = species;
    }
    public String getName() {
        return nameDog;
    }

    public String toString(){
        return "Dog's name is " + nameDog + ", age = " + age + ", species is " + species;
    }
}