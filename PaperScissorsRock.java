import java.util.Scanner;
import java.util.Random;

public class PaperScissorsRock {
    public static void main(String[] args) {
        // declare variables
        int rounds;
        String player1;
        String player2;
        int wins;
        int draws;
        int losses;
        String[] choices = {"Rock", "Paper", "Scissors"};
        int randomGuess;
        String playAgain = "Yes";

        // create a scanner
        Scanner myScanner = new Scanner(System.in);

        // create a random object
        Random randomizer = new Random();


        // play the game
        while (playAgain.equals("Yes")) {
            // Set wins losses and draws to zero
            int i = 1;           // index to track number of rounds
            wins = 0;
            losses = 0;
            draws = 0;


            // ask user how many rounds they want to play
            System.out.println("How many rounds do you want to play?");
            rounds = myScanner.nextInt();
            // keeps asking for input until they enter a number between 1 and 10
            if (rounds <1 || rounds > 10) {
                while (rounds < 1 || rounds > 10) {
                    System.out.println("Invalid input! Please enter a number between 1 and 10");
                    rounds = myScanner.nextInt();
                }
            }

            while (i <= rounds) {
                System.out.println("Round number " + i);
                System.out.println("Choose Rock, Paper, or Scissors: ");
                player1 = myScanner.next();
                if (!player1.equals("Rock") && !player1.equals("Paper") && !player1.equals("Scissors")) {
                    while (!player1.equals("Rock") && !player1.equals("Paper") && !player1.equals("Scissors")) {
                        System.out.println("Invalid input! Please enter Rock , Paper , or Scissors");
                        player1 = myScanner.next();
                    }
                }
                randomGuess = randomizer.nextInt(2);
                player2 = choices[randomGuess];
                System.out.println("You chose " + player1);
                System.out.println("Player2 chose " + player2);
                if (player1.equals("Rock")) {
                    if (player2.equals("Scissors")) {
                        System.out.println("You win");
                        wins++;
                    }
                    if (player2.equals("Paper")) {
                        System.out.println("You lose");
                        losses++;
                    }
                    if (player2.equals("Rock")) {
                        System.out.println("It's a draw");
                        draws++;
                    }
                }
                if (player1.equals("Paper")) {
                    if (player2.equals("Rock")) {
                        System.out.println("You win");
                        wins++;
                    }
                    if (player2.equals("Scissors")) {
                        System.out.println("You lose");
                        losses++;
                    }
                    if (player2.equals("Paper")) {
                        System.out.println("It's a draw");
                        draws++;
                    }
                }
                if (player1.equals("Scissors")) {
                    if (player2.equals("Scissors")) {
                        System.out.println("You win");
                        wins++;
                    }
                    if (player2.equals("Paper")) {
                        System.out.println("You lose");
                        losses++;
                    }
                    if (player2.equals("Rock")) {
                        System.out.println("It's a draw");
                        draws++;
                    }
                }
                i++;
            }
            System.out.println("You won " + wins + " games");
            System.out.println("You lost " + losses + " games");
            System.out.println("You drew " + draws + " games");
            if (wins > losses) {
                System.out.println("You are the overall winner! Congratulations!");
            }
            if (losses > wins) {
                System.out.println("You are the overall loser :( Try harder next time");
            }
            System.out.println("Do you want to play again? Enter Yes or No");
            playAgain = myScanner.next();
        }
        System.out.println("Thanks for playing!");
    }
}
