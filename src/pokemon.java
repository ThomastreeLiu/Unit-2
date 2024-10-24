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
                if (pikaHP < 40 || bulbaHP < 40){
                    System.out.println("***** The battle continues   *****");
                }
             System.out.println(" Pikachu's HP:\t\t" + pikaHP);
             System.out.println(" Bulbasaur's HP:\t" + bulbaHP);

             System.out.println("\nWhat attack did does the Bulbasaur choose?");
             System.out.println("(1)Seed Bomb ");
             System.out.println("(2)Sludge Bomb ");
             System.out.println("(3)Power Whip ");

             System.out.println("Bublasaur's attack? ");

              int choice = scan.nextInt();
              int rand = (int)(Math.random () * 3) + 1;

              if (rand == 1)
                    System.out.println("Pikachu responds with a Electro Ball\n");
              else if (rand == 2)
                    System.out.println("Pikachu responds with a Thunder Shock\n");
              else
                 System.out.println("Pikachu responds with nothing\n");

             int winner = (int)(Math.random()*2)+1;
             int pts = (int)(Math.random()*15)+5;
             if (winner == 1){
                 if (rand==3)
                     System.out.println("Pikachu does nothing");
                 else {
                     System.out.println("Pikachu does " + pts + " damage to Bulbasaur\nPikachu wins");
                     bulbaHP = bulbaHP - pts;
                 }
             }
             else if (winner == 2){
                 System.out.println("Bulbasaur does "+pts+" damage to Pikachu\nBulbasaur wins");
                 pikaHP=pikaHP-pts;
             }
            }
         System.out.println("\n*****The battle is over!!!*****\n");
         if (pikaHP<=0)
             System.out.println("Pikachu has lost the battle!\n"+"Bulbasaur wins the battle!\n");
         else
             System.out.println("Bulbasaur has lost the battle!\n"+"Pikachu wins the battle!\n");

         System.out.println("Play again?(y/n)");
         again= scan.next();
        }
    }
}
