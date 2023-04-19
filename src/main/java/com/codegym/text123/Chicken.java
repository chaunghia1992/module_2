package com.codegym.text123;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: Cluck-cluck";
    }

    @Override
   public String howToEat(){
        return " could be fried";
    }
}
