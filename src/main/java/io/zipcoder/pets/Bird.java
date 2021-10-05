package io.zipcoder.pets;

public class Bird extends Pets {


    public Bird(String name, String typePet) {
        super(name, typePet);
    }

    @Override
    public void Speak() {
        System.out.println("Tweet tweet");

    }


}
