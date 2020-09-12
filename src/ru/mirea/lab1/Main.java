package ru.mirea.lab1;

import java.util.Scanner;
import ru.mirea.lab1.Ball;
import ru.mirea.lab1.Book;
import ru.mirea.lab1.Dog;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameDog, nameBook, type, species, colour;
        int age, page, rad;

        nameDog = scanner.nextLine();
        age = scanner.nextInt();
        species = scanner.nextLine();
        Dog FirstDog = new Dog(nameDog, age, species);
        System.out.println(FirstDog.toString());

        nameBook = scanner.nextLine();
        page = scanner.nextInt();
        Book FirstBook = new Book(nameBook, page);
        System.out.println(FirstBook.toString());

        colour = scanner.nextLine();
        rad = scanner.nextInt();
        type = scanner.nextLine();
        Ball FirstBall = new Ball(rad, colour, type);
        System.out.println(FirstBall.toString());
    }
}