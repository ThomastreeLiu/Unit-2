//Author:Thomas
//Name:GuessNum
//Purpose:guess the in 10

import java.util.Scanner;
public class GuessNum{
    public static void main (String args[]){

        Scanner scan = new Scanner(System.in);
        String continueous = "y";
        while (continueous.equals("y") || continueous.equals("Y")) {
            int num1 = (int) (Math.random() * 10) + 1;
            System.out.println("Guess the number (1-10): ");
            int ans1 = scan.nextInt();

            while (num1 != ans1) {
                System.out.println("Nope, try again");
                System.out.println("Guess the number (1-10): ");
                ans1 = scan.nextInt();
            }
            System.out.println("Right! Good job.");
            System.out.println("play again? (y or n)");
            continueous = scan.next();
        }
    }

}


