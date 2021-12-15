import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        int userScore = 0;
        int computerScore = 0;

        String user = "";
        String cp = "";

        Scanner input = new Scanner(System.in);

        System.out.println(" Let's Start !");

        while((computerScore != 5) && (userScore != 5)){

            System.out.println("------------------------------------------\n"+
                    " Your Score : " + userScore  + " - My Score : " + computerScore +
                    "\n Press 1 : Rock ?" +
                    "\n Press 2 : Paper ?" +
                    "\n Press 3 : Scissor ?");

                int userChoice = input.nextInt();
                int cpChoice = (int)(Math.random() * 3 + 1);

                switch (userChoice){
                    case 1 : user = "Rock";
                        break;
                    case 2 : user = "Paper";
                        break;
                    case 3 : user = "Scissor";
                }
                switch (cpChoice){
                case 1 : cp = "Rock";
                    break;
                case 2 : cp = "Paper";
                    break;
                case 3 : cp = "Scissor";
                }

            System.out.println( "************************************************"
                    +"\nYour answer " + userChoice + ": " + user +
                    " --  My answer " + cpChoice + ": " + cp);

                if(userChoice == 1 && cpChoice == 2 ) {
                    System.out.println("You lost.");
                    computerScore++;
                }
                else if(userChoice == 1 && cpChoice == 3 ) {
                    System.out.println("You win.");
                    userScore++;
                }
                else if(userChoice == 2 && cpChoice == 1 ) {
                    System.out.println("You win.");
                    userScore++;
                }
                else if(userChoice == 2 && cpChoice == 3 ) {
                    System.out.println("You lost.");
                    computerScore++;
                }
                else if(userChoice == 3 && cpChoice == 1 ) {
                    System.out.println("You lost.");
                    computerScore++;
                }
                else if(userChoice == 3 && cpChoice == 2 ) {
                    System.out.println("You win.");
                    userScore++;
                }
                else{
                    System.out.println("Deuce");
                }


        }

        System.out.println((computerScore > userScore) ? "\n\nYou lost the game." : " You win the game. ");




    }



}
