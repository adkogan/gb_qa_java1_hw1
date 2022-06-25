package ru.gb.homeworkapp.hw7;

public class Cat {

    private String name;
    private int appetite;
    private boolean fullness;


    public Cat(String  name, int appetite) {
        this.appetite = appetite;
        this.name=name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }



    public void setFullness() {
       fullness = false;
    }

    public boolean eat(Plate plate){

        if(plate.getFoodAmount()>=appetite){
        plate.decreaseFoodAmount(appetite);
        fullness = true;

        return true;

            }
        return false;
    }
}
