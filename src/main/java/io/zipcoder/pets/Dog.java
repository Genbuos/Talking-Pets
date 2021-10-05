package io.zipcoder.pets;

public class Dog extends Pets {


    public Dog(String name, String typePet) {
        super(name, typePet);
    }

    @Override
    public void Speak() {
        System.out.println("Woof woof");
    }


}
