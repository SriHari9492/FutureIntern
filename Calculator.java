import java.util.*;
public class Calculator{
    public static void main(String args[]){
        int num1 , num2 , result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of num1:");
        num1 = sc.nextInt();
        System.out.println("Enter the number of num2:");
        num2 = sc.nextInt();
         char operator = sc.next().charAt(0);
       switch(operator)
       {
        case '+':
            result= num1+num2;
            System.out.println("result :" +result);
            break;
            case '-':
                result =num1-num2;
                System.out.println("result:"+result);
               break;
               case '*':
                result =num1-num2;
                System.out.println("result:"+result);
               break;
               case '/':
                result =num1-num2;
                System.out.println("result:"+result);
               break;
               default:
                System.out.println("Error");


       }
        

        }

}