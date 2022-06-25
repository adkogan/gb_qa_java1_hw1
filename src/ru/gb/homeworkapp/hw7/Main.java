package ru.gb.homeworkapp.hw7;

public class Main {
    public static void main(String[] args) {


        Cat[] cats = new Cat[4];

        cats[0] = new Cat("Barsik", 1);
        cats[1] = new Cat("Murka", 2);
        cats[2] = new Cat("Begemot", 3);
        cats[3] = new Cat("Ryzhyk", 4);
        Plate plate = new Plate(8);


        System.out.println("initial food amount: " + plate.getFoodAmount());

        for (Cat cat : cats) {
            cat.setFullness();
            if (cat.eat(plate)) {
                System.out.println(cat.getName() + " is full");
            } else {
                System.out.println(cat.getName() + " has not eaten");

            }
        }

            System.out.println("food amount left: " + plate.getFoodAmount());

            plate.increaseFoodAmount(10);
            System.out.println("current food amount: " + plate.getFoodAmount());

        }

        }






