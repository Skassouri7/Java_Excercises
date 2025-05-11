package Section7.Lesson114_Challenge;

public class Main {
    public static void main(String[] args) {
        Hamburger doubleSmashburger = new Hamburger("Double Smash Burger", 9.50);
        doubleSmashburger.addExtraToppings("sauce");
        doubleSmashburger.addExtraToppings("cheese");
        doubleSmashburger.addExtraToppings("meat");

        Meal myMeal = new Meal(new Drink("Fanta", 2.50, "Large"), doubleSmashburger,  new Extra("Jalapeno bites", 3.50));
        System.out.println(myMeal);
    }
}
