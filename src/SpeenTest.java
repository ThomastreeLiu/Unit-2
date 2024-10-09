import java.util.Scanner;
public class SpeenTest {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String D = "y";
        while (D.equals("y")||D.equals("Y")){
            System.out.println("Enter the speed limit:");
            int sl = scan.nextInt();
            System.out.println("Enter the recorded speed of the car:");
            int sp = scan.nextInt();
            if (sp<=sl) {
                System.out.println("Congratulations, you are within the speed limit! ");
            }
            else if (sp>sl&&(sp-sl)<=30) {
                System.out.println("You are speeding and your fine is $196.");
            }
            else if (sp>sl&&(sp-sl)<=60&&(sp-sl)>30) {
                System.out.println("You are speeding and your fine is $368.");
            }
            else if (sp>sl&&(sp-sl)>60) {
                System.out.println("You are speeding and your fine is $483.");
            }
            else
                System.out.println("Not a good value");
            System.out.println("Continue?  (y or n)");
            D = scan.next();
        }
    }
}
