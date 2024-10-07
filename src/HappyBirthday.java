import java.util.Scanner;
public class HappyBirthday {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is their name?");
        String name = scan.nextLine();
        System.out.println("When was they born?");
        int age = scan.nextInt();
        System.out.println("What year is it now?");
        int year = scan.nextInt();
        for (;age<=year;age++){
            System.out.println(age);
            System.out.println("Happy Birthday to you, Happy Birthday to you! Happy Birthday dear Dad, Happy Birthday to you! ");
        }
    }
}
