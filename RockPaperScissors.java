import java.util.*;
public class RockPaperScissors {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] options ={"Rock", "Paper", "Scissors"};
        boolean keepPlaying = true;
        System.out.println("Welcome to Game");
        while(keepPlaying) {
            System.out.println("Enter your choice : 1 for Rock , 2 for paper , 3 for Scissors" );
            int userChoice = sc.nextInt();
            if(userChoice < 1 || userChoice > 3){
                System.out.println("Invalid choice. Please select 1,2, or 3");
                continue;
            }
            int computerChoice = random.nextInt(3);
            System.out.println("You choose:" + options[userChoice -1]);
            System.out.println("Computer choose:" + options[computerChoice]);

            if(userChoice -1 == computerChoice) {
                System.out.println("It's a tie");

            }else if ((userChoice -1 == 0 && computerChoice ==2) || (userChoice -1 == 1 && computerChoice == 0)|| (userChoice -1 ==2 && computerChoice ==1)) {
                System.out.println("You win");
            }else {
                System.out.println("You lose !");
            }
            System.out.println("Do you want to play again /(yes/no)");
            String response = sc.next();
            if(!response.equalsIgnoreCase("Yes")){
                keepPlaying = false;
                System.out.println("Thanks for Playing!");
            }
        }
        sc.close();
    }

}