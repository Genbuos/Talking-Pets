package io.zipcoder.pets;

public class Cat extends Pets{


    public Cat(String name, String typePet) {
        super(name, typePet);
    }

    @Override
    public void Speak() {
        System.out.println("meow meow");
    }


}
