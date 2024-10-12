//Author:Thomas
//Name:pokemon
//Purpose:Play a pokemon game

import java.util.Scanner;

public class pokemon {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String again = "y";
        while (again.equals("y")){
            System.out.println("A Pikachu and a Bulbasaur meet on a field!");
            int pikaHP = 40;
            int bulbaHP = 40;
            while (pikaHP >= 0 && bulbaHP >= 0){
                if (pikaHP != 41 || bulbaHP != 41){
                    System.out.println("***** The battle continues   *****");
                }
             System.out.println(" Pikachu's HP:\t\t" + pikaHP);
             System.out.println(" Bulbasaur's HP:\t" + bulbaHP);
             System.out.println("");

             System.out.println("What attack did does the Bulbasaur choose?");
             System.out.println("(1)Seed Bomb ");
             System.out.println("(2)Sludge Bomb ");
             System.out.println("(3)Power Whip ");

             System.out.println("Bublasaur's attack? ");

             int choice = scan.nextInt();
             int rand = (int)(Math.random () * 3) + 1;

             if (rand == 1)
                    System.out.println("Pikachu responds with a _________");
             else if (rand == 2)
                    System.out.println("Pikachu responds with a _________");


            }
        }
    }
}
