//Author:Thomas
//Name:Riddle
//Purpose:Guess egg

import java.util.Scanner;
public class Riddle {
    public static void main(String[] args){
        int tries = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("What's broken before you use it?");
        String ans = scan.nextLine();
        while (tries<3&&!ans.equals("egg")){
            System.out.println("Incorrect. Try again ");
            tries =tries+1;
            ans = scan.next();
        }
        if (ans.equals("egg"))
            System.out.println("Good job!");
        else
            System.out.println("Three tries are up. It was an egg.");
    }
}
