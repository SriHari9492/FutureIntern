import java.util.*;
public class NumberGuessingGame{
    public static void main(String args[]){
        
        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;

        Scanner sc = new Scanner(System.in);
        int userGuess =0;
        int attempts =0;
         while (userGuess != numberToGuess) {
            System.out.println("Enter your guess:");
            userGuess = sc.nextInt();
            attempts++;
            if(userGuess < numberToGuess){
                System.out.println("Too low Try Again");

            }else if(userGuess > numberToGuess){
                System.out.println("too High try Again");


            }
            else {
                System.out.println("Congratulations ! you 've guessed the "+numberToGuess+"in"+attempts+"attempts");
            }
         }
         sc.close();

    }

}