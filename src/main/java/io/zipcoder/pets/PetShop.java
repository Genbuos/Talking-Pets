package io.zipcoder.pets;

import java.util.*;

public class PetShop {
    public static void main(String[] args) {



        ArrayList<Pets>pets = new ArrayList<>();



        Scanner fetch = new Scanner(System.in);
        System.out.println("How many pets do you have? ");


        int petNum = fetch.nextInt();
        for(int i = 0; i < petNum; i++){
            //Asking for petType
            Scanner sd = new Scanner(System.in);
            System.out.println("What kind of pet do you have? ");
            String petType = sd.next();
            //Asking for petName
            Scanner getName = new Scanner(System.in);
            System.out.println("What is your pets name");
            String petName = getName.next();



            switch (petType.toLowerCase()){
                case "dog" :
                    Dog dog1 = new Dog(petName, petType);
                    pets.add(dog1);
                    dog1.Speak();
                    break;
                case "cat" :
                    Cat cat1 = new Cat(petName, petType);
                    pets.add(cat1);
                    cat1.Speak();
                    break;
                case "bird" :
                    Bird bird1 = new Bird(petName, petType);
                    pets.add(bird1);
                    bird1.Speak();
                    break;
                default:
                    System.out.println("Error Pet not supported");


            }


            System.out.println(pets);















        


    }
}}
