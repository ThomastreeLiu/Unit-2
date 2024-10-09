//Author:Thomas
//Name:GuessNum
//Purpose:guess the number

import java.util.Scanner;
public class GuessNum{
    public static void main (String args[]){

        Scanner scan = new Scanner(System.in);
        String D = "y";
        while (D.equals("y") || D.equals("Y")) {
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
            D = scan.next();
        }
    }

}


