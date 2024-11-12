//This is not a part of unit 2
//Author:Thomas
//Name:Physics
//Purpose:Enter the data of physics experiment and get answer of it.

import java.util.Scanner;
public class physics {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
<<<<<<< Updated upstream
=======
        double vf = 0;
        //double d = 0;
>>>>>>> Stashed changes
        double a = 0;
        double t = 0;
        double opp = 0;
        double hyp = 0;
<<<<<<< Updated upstream
        while (1 == 1){
=======
        String con = "y";
        while (con.equals("y")){
>>>>>>> Stashed changes
            System.out.println("enter height");
            opp=scan.nextDouble();
            System.out.println("enter the length");
            hyp=scan.nextDouble();
            System.out.println("enter the time");
<<<<<<< Updated upstream
            t=scan.nextFloat();
            a= 2*hyp/Math.pow(t,2);
            double guessa = 9.8*opp/hyp;
            System.out.println("a= "+a+"\nthe a from equation is "+guessa);
=======
            t=scan.nextDouble();
            //a= hyp*2/Math.pow(t,2);
            a = 2*hyp/Math.pow(t,2);
            vf=a*t;
            //double angle = Math.asin(opp/hyp);
            //double guessa = 9.8*Math.sin(angle);
            System.out.println("a= "+a+"\nvf= "+vf);
            System.out.println("again?(y/n)");
            con=scan.next();
>>>>>>> Stashed changes
        }
    }
}