import java.util.Random;
import java.util.Scanner;

class GuessingGame {
  public static void main(String[] args) {
    Random tej = new Random();
    int score = 0;
    int rounds = 0;
    Scanner input = new Scanner(System.in);

    while (true) {
      int numberToGuess = tej.nextInt(100) + 1 ;
      int attempts = 0;

      while (true) {
        System.out.print("Guess a number between 1 and 100: ");
        int guess = input.nextInt();
        attempts++;

        if (guess == numberToGuess) {
          System.out.println("Correct!");
          score++;
          break;
        } else if (guess > numberToGuess) {
          System.out.println("Too high!");
        } else {
          System.out.println("Too low!");
        }

        if (attempts >= 6) {
          System.out.println("Out of attempts! The number was " + numberToGuess);
          break;
        }
      }

      rounds++;
      System.out.println("Your score: " + score + " rounds: " + rounds);

      System.out.print("Play again? (y/n): ");
      String response = input.next();

      if (!response.equalsIgnoreCase("y")) {
        break;
      }
    }
  }
}