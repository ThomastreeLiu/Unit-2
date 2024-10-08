import java.util.Scanner;

public class Game1{ 



    public static void main (String args[]){



        Scanner scan = new Scanner(System.in);

        int num1 = (int)(Math.random () * 10) + 1;
        char end = 'n';

        System.out.println("Guess the number (1-10): ");
        int ans1 = scan.nextInt();
        while(end=='n') {
            while(num1 != ans1){
                System.out.println("Guess the number (1-10): ");
                ans1 = scan.nextInt();
                if(ans1!=num1){
                    System.out.println("Nope. Try again");
                    ans1= scan.nextInt();
            System.out.println("End? y/n");
            end=scan.next().charAt(0);
                }
            }

        }

        System.out.println("Right! Good job."); System.out.println();



    }

} 