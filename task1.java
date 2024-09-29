//Java program to guess a number

import java.util.Random;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numberguess = random.nextInt(100) + 1; 
        int attempts = 10;
        System.out.println("Enter a number between 1 and 100.");

        for (int i = 0; i < attempts; i++) {

            System.out.print( " Enter your guess: ");
            int guess = sc.nextInt();

            if (guess < numberguess) 
            {
                System.out.println("Very low!");
            }
            else if (guess > numberguess) 
            {
                System.out.println("Very high!");
            }
            else 
            {
                System.out.println("Congratulations! You guessed the number in " + i + " attempts!");
            }
        }
        System.out.println("Sorry, you finished your attempts! The number is " + numberguess);
    }
}
