//Author:Thomas
//Name:Guessinggame
//Purpose:guess number

import java.util.Scanner;

public class GuessGame1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String continueous = "y";
        while (continueous.equals("y") || continueous.equals("Y")) {
            int num1 = (int) (Math.random() * 100) + 1;
            System.out.println("Guess?");
            int ans1 = scan.nextInt();
            int i = 1;

            while (num1 != ans1) {
                if (ans1 < num1)
                    System.out.println("Too Low!");
                else
                    System.out.println("Too high!");
                System.out.println("Guess the number (1-100): ");
                ans1 = scan.nextInt();
                i = i + 1;
            }
            System.out.println("Right! Good job.");
            System.out.println("You took " + i + " tries.");
            System.out.println("play again? (y or n)");
            continueous = scan.next();
        }
    }
}