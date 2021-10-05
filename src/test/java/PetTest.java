import org.junit.Test;

import java.util.Scanner;

public class PetTest {
    @Test

    public static void main(String[] args) {
        System.out.println("How many pets do you have?");
        Scanner scanner = new Scanner(System.in);

        int numOfPets = scanner.nextInt();


        System.out.println("what type of pet or pets do you have?");
        String  petTypes = scanner.next();

        System.out.println("");


    }
}
