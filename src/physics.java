//This is not a part of unit 2
//Author:Thomas
//Name:Physics
//Purpose:Enter the data of physics experiment and get answer of it.

import java.util.Scanner;
public class physics {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        double vf = 0;
        double a = 0;
        double t = 0;
        double opp = 0;
        double hyp = 0;
        while (1 == 1){
            System.out.println("enter height");
            opp=scan.nextDouble();
            System.out.println("enter the length");
            hyp=scan.nextDouble();
            System.out.println("enter the time");
            t=scan.nextDouble();
            a= 2*hyp/Math.pow(t,2);
            double guessa = 9.8*opp/hyp;
            System.out.println("a= "+a+"\nthe a from equation is "+guessa);
        }
    }
}