package ru.geekbrains.lesson1;

public class Chocolate extends Product{
    
    private int weight;
    private int calories;
    
    public Chocolate(String brand, String name, double price, int weight, int calories) {
        super(brand, name, price);
        this.weight = weight;
        this.calories = calories;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getCalories() {
        return calories;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String displayInfo() {
        return String.format("[Плитка шоколада] %s - %s - %f [весом: %d] [калорийностью: %d]", brand, name, price, weight, calories);
    }
}


