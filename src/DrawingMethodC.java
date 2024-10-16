import java.util.Scanner;

public class DrawingMethodC {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word;
        int tries = 0;
        letterC();letterA();letterR();
        System.out.println("1. What word is written above? ");
        word = scan.next();
        while(!word.equalsIgnoreCase("car")){
            System.out.println("No, try again. What word is written above? ");
            word = scan.next();
            tries++;
        }

        letterA();letterR();letterC();
        System.out.println("2. What word is written above? ");
        word = scan.next();
        while(!word.equalsIgnoreCase("arc")){
            System.out.println("No, try again. What word is written above? ");
            word = scan.next();
            tries++;
        }
        letterC();letterA();letterR();letterT();
        System.out.println("3. What word is written above? ");
        word = scan.next();
        while(!word.equalsIgnoreCase("cart")){
            System.out.println("No, try again. What word is written above? ");
            word = scan.next();
            tries++;
        }
        letterT();letterA();letterR();

        System.out.println("4. What word is written above? ");
        word = scan.next();
        while(!word.equalsIgnoreCase("tar")){
            System.out.println("No, try again. What word is written above? ");
            word = scan.next();
            tries++;
        }
        letterC();letterA();letterT();
        System.out.println("5. What word is written above? ");
        word = scan.next();
        while(!word.equalsIgnoreCase("cat")){
            System.out.println("No, try again. What word is written above? ");
            word = scan.next();
            tries++;
        }
        letterR();letterA();letterT();
        System.out.println("6. What word is written above? ");
        word = scan.next();
        while(!word.equalsIgnoreCase("rat")){
            System.out.println("No, try again. What word is written above? ");
            word = scan.next();
            tries++;
        }
        System.out.println("\nS C O R E ");
        System.out.println("You took " + tries + " extra tries to guess the words.");
        if(tries == 0)
            System.out.println("Wow! You guessed every word first try!");
        else if(tries <= 2)
            System.out.println("Nice work. You guessed most words on the first try.");
        else if(tries <= 6)
            System.out.println("Not bad. You took a few tries on some words.");
        else
            System.out.println("ASCII art is tricky to read. Better luck next time.");
    }
    public static void letterC(){
        System.out.println(" * * *");
        System.out.println(" * ");
        System.out.println(" * ");
        System.out.println(" * * *\n");
    }

    public static void letterA(){
        System.out.println("   *");
        System.out.println("  * *");
        System.out.println(" * * *");
        System.out.println("*     *\n");
    }

    public static void letterR(){
        System.out.println(" * *");
        System.out.println(" *   *");
        System.out.println(" *  *");
        System.out.println(" *   *\n");
    }

    public static void letterT(){
        System.out.println(" * * *");
        System.out.println("   *");
        System.out.println("   *");
        System.out.println("   *\n");
    }
}
