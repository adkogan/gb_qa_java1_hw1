package ru.gb.homeworkapp.hw7;

public class Plate {

    private int foodAmount;

    public Plate(int foodAmount) {
        this.foodAmount = foodAmount;
    }


    public int getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(int amount) {
        this.foodAmount = foodAmount;
    }

    public void increaseFoodAmount(int foodToAdd){
        foodAmount += foodToAdd;
    }

    public void decreaseFoodAmount(int foodToRemove){
        if(foodToRemove<= foodAmount) {
            foodAmount -= foodToRemove;
        }else System.out.println("Not enough food");
    }





}
