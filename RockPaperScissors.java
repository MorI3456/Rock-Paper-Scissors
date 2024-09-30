import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
       
        String[] rps = {"r", "p", "s"};//An array with the different options 
        String computerMove = rps[new Random().nextInt(rps.length)];//Computers move

        Scanner scanner = new Scanner(System.in);
        String playerMove;
        


        while(true){
            System.out.println("Please enter your move (r, p, or s) ");
            playerMove = scanner.nextLine();
            if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s"))
                break;
        }
       
        System.out.println("Computer played:" + computerMove);

        if(playerMove.equals(computerMove)) {
            System.out.println("You tied");
        }
        //Computer Wins
        else if (playerMove.equals("r")) {
            if (computerMove.equals("p")) {
                System.out.println("Paper beats Rock, the Computer wins!");
            }
        }
        else if (playerMove.equals("p")) {
            if (computerMove.equals("s")) {
                System.out.println("Scissors beat Paper, the Computer wins!");
            }
        }
        else if (playerMove.equals("s")) {
            if (computerMove.equals("r")) {
                System.out.println("Rock beats Scissors, the Computer wins!");
            }
        }

        //User Wins
        else if (playerMove.equals("p")) {
            if (computerMove.equals("r")) {
                System.out.println("Paper beats Rock, the User wins!");
            }
        }
        else if (playerMove.equals("s")) {
            if (computerMove.equals("p")) {
                System.out.println("Scissors beat Paper, the User wins!");
            }
        }
        else if (playerMove.equals("r")) {
            if (computerMove.equals("s")) {
                System.out.println("Scissor beats Rock, the User wins!");
            }
        }

    }




























}