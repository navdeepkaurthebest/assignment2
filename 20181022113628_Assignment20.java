package assignment20;

import java.util.Random;
import java.util.Scanner;

public class Assignment20 {

    public static void main(String[] args) {
        int i;
        int elemCount;
        int RandomNumber;
        int SearchNumber;
        int Location = -1;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many elements ?  ");
        elemCount = keyboard.nextInt();

        Random randomNumber = new Random();

        System.out.println("Random numbers are : ");
        int[] array = new int[elemCount];
        for (i = 0; i < elemCount; i++) {

            RandomNumber = randomNumber.nextInt(1000);
            array[i] = RandomNumber;
            System.out.println((i+1) + " : " + RandomNumber);

        }
        System.out.println("Which number to search ? ");
        SearchNumber = keyboard.nextInt();
        for (i = 0; i < elemCount; i++) {
            if (array[i] == SearchNumber) {
                Location = i + 1;

            }
        }
        if (Location == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index :" + Location);
        }

        System.out.println("End  of this assignment ");
    }
}
