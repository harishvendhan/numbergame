import java.util.Random;
import java.util.Scanner;

public class randomm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;

        while (true) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 5;
            boolean hasWon = false;

            System.out.println("    ****Welcome to the Guess the Number Game!****");
            System.out.println();
            System.out.println("NOTE:\n-I have generated a number between 1 and 100.");
            System.out.println("-You have " + attempts + " attempts to guess the number.");
            System.out.println();
            System.out.println("    ***Let's start the game***");

            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts--;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    hasWon = true;
                    score++;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }

                if (attempts > 0) {
                    System.out.println("You have " + attempts + " attempts left.");
                    if(attempts==1)
                    {
                        System.out.println("the final attempt");
                    }
                } 
                 else {
                    System.out.println("Sorry, you've run out of attempts. The correct number was " + numberToGuess);
                }
            }

            System.out.println("Your current score is: " + score);

            System.out.print("Do you want to play another round? (yes/no): ");
            scanner.nextLine();  // Consume newline
            String playAgain = scanner.nextLine();

            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for playing! Your final score is: " + score);
                break;
            }
        }

        scanner.close();
    }
}


