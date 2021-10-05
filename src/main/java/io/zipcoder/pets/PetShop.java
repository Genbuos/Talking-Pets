package io.zipcoder.pets;

import java.util.*;

public class PetShop {
    public static void main(String[] args) {







        Scanner fetch = new Scanner(System.in);
        System.out.println("How many pets do you have? ");

        int petNum = fetch.nextInt();

        Pets[] petArray = new Pets[petNum];


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
                    petArray[0] = dog1;
                    dog1.Speak();
                    break;
                case "cat" :
                    Cat cat1 = new Cat(petName, petType);
                    petArray[1] = cat1;
                    cat1.Speak();
                    break;
                case "bird" :
                    Bird bird1 = new Bird(petName, petType);
                    petArray[3] = bird1;
                    bird1.Speak();
                    break;
                default:
                    System.out.println("Error Pet not supported");


            }


            System.out.println(Arrays.toString(petArray));















        


    }
}}
