//Author:Thomas
//Name:FizzBuzz
//Purpose:Simulating a game of fizzbuzz

import java.util.Scanner;
public class FizzBuzz {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What number are we going to: ");
        int lastNum = scan.nextInt();
        for (int i = 0;i<=lastNum;i++){
            if (i%3==0&&i%5==0)
                System.out.println("Fizz-Buzz");
            else if (i%3==0)
                System.out.println("Fizz");
            else if (i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i);
            }
        }
    }