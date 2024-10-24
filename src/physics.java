//This is not a part of unit 2
//Author:Thomas
//Name:Physics
//Purpose:Enter the data of physics experiment and get answer of it.

import java.util.Scanner;
public class physics {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        float vf = 0;
        float d = 0;
        float a = 0;
        float t = 0;
        float opp = 0;
        float hyp = 0;
        String con = "y";
        while (con.equals("y")){
            System.out.println("enter height");
            opp=scan.nextFloat();
            System.out.println("enter the length");
            hyp=scan.nextFloat();
            System.out.println("enter the time");
            t=scan.nextFloat();
            a= (float) (hyp*2/Math.pow(t,2));
            vf=a*t;
            double angle = Math.asin(opp/hyp);
            double guessa = 9.8*angle;
            System.out.println("a= "+a+"\nvf= "+vf+"\nthe a from equation is "+guessa);
            System.out.println("again?(y/n)");
            con=scan.next();
        }
    }
}
