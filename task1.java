//Java program to guess the number
import java.util.Random;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        final int min_number = 1;
        final int max_number = 100;
        final int max_attempts = 10;
        boolean playagain = true;
        while (playagain) {
            int numbertoguess = random.nextInt(max_number - min_number+1)+min_number;
            int attempts = 0;
            boolean guessedcorrectly = false;
            System.out.println("Guess the number between"+min_number+" and "+max_number+":");
            while (attempts<max_attempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number " +numbertoguess+ " in " + attempts + " attempts.");
                     guessedcorrectly = true;
                    break;
                } else if (guess < numbertoguess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }
            if (!guessedcorrectly) {
                System.out.println("Sorry, you've used all " + max_attempts + " attempts. The correct number is " + numbertoguess+ ".");
            }
            System.out.print("Do you want to play another round? (yes/no):");
            String response = scanner.next().trim().toLowerCase();
            playAgain = response.equals("yes");
        }
        scanner.close();
    }
}
