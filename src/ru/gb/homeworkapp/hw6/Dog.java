package ru.gb.homeworkapp.hw6;

public class Dog extends Animal {


    private static final int maxRunDistance = 500;
    private static final int maxSwimDistance = 10;

    public Dog(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
    }

    @Override
    public void run(int distance) {
        if (distance > 0 && distance < maxRunDistance) {

            System.out.println(this.getName() + " runs " + distance + " meters ");
        }
        else{
            System.out.println("Dog do not run that much");
        }
    }

    @Override
    public void swim (int distance) {
            if(distance >0 && distance < maxSwimDistance){
                System.out.println(this.getName() + " swims " + distance + " meters ") ;
            }
            else{
                System.out.println("Dogs do not swim that much");
            }

    }
}
