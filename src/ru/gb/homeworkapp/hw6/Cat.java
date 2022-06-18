package ru.gb.homeworkapp.hw6;

public class Cat extends Animal{

    private static final int maxRunDistance = 200;
    private static final int maxSwimDistance = 0;


    public Cat(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
    }

    @Override
    public void run(int distance) {
        if (distance > 0 && distance < maxRunDistance) {

            System.out.println(this.getName() + " runs " + distance + " meters ");
        }
        else {
            System.out.println("Cats do not run that much");
        }

    }

    @Override
    public void swim(int distance) {
        if (distance > 0 && distance < maxSwimDistance) {

            System.out.println(this.getName() + " runs " + distance + " meters ");
        }
        else{
            System.out.println("Cats do not swim");
        }

    }


}
