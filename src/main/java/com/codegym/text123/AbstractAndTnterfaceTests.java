package com.codegym.text123;

public class AbstractAndTnterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken ();
        for(Animal animal : animals){
            System.out.println(animal.makeSound());
            if(animal instanceof Chicken){
                Edible edible = (Edible) animal;
                System.out.println(edible.howToEat());
            }
        }
    }
}
