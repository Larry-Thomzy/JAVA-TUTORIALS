package TUTORIAL;

import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main (String [] args) {
        // ROCK PAPER SCISSORS GAME

        Scanner input = new Scanner(System.in);
        Random ram = new Random();

        // DECLARE VARIABLES
        // GET A CHOICE FROM THE USER
        // GET RANDOM CHOICE FOR THE COMPUTER
        // CHECK WIN CONDITIONS
        // ASK TO PLAY AGAIN
        // GOODBYE MESSAGE

        String [] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            System.out.print("Enter your move (rock, paper, scissors ): ");
            playerChoice = input.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid Choice");
            }


            computerChoice = choices[ram.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) || (playerChoice.equals("paper") && computerChoice.equals("rock")) || (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            }
            else {
                System.out.println("You Lose!");
            }

            System.out.print("Play again (yes/no): ");
            playAgain = input.nextLine().toLowerCase();
        }while (playAgain.equals("yes"));

        System.out.println("Game Ended");



    }
}
