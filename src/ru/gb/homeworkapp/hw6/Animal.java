package ru.gb.homeworkapp.hw6;

public abstract class Animal {


    private  String name;
    private int runDistance;
    private int swimDistance;
    private static int count;

    public Animal(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        count++;
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void run(int runDistance);

    public abstract void  swim(int swimDistance);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

    public int getSwimDistance() {
        return swimDistance;
    }

    public void setSwimDistance(int swimDistance) {
        this.swimDistance = swimDistance;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", runDistance=" + runDistance +
                ", swimDistance=" + swimDistance +
                '}';
    }

}


