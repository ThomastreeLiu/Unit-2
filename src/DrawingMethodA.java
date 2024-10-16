//Author:Thomas
//Name:methodA
//Purpose:draw graph by using method

public class DrawingMethodA {
    public static void main (String[] args){
        System.out.println("Here is a circle:");
        drawCircle ();
        System.out.println("Here is a tree:");
        drawCircle();
        drawLines();
        System.out.println("Here is a spoon:");
        drawCircle();
        drawLines();
        drawLines();
        System.out.println("Here is a barbell:");
        drawCircle();
        drawLines();
        drawLines();
        drawCircle();
        System.out.println("Here is an eight:");
        drawCircle();
        drawCircle();
    }
    public static void drawCircle(){
        System.out.println("  **");
        System.out.println(" *  *");
        System.out.println("  **");
    }
    public static void drawLines(){
        System.out.println("  ||");
    }
}
