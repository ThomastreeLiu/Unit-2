public class DrawingMethodB {
    public static void main(String[] args){
        System.out.println("Here is a house:");
        triangle();
        square();
        System.out.println("Here is a candy:");
        square();
        circle();
        square();
        System.out.println("Here is a hat:");
        circle();
        triangle();
        System.out.println("Here is a pencil:");
        triangle();
        square();
        circle();
        System.out.println("Here is a play arrow:");
        triangle();
        triangle();
        System.out.println("Here is an eight:");
        circle();
        circle();
    }
    public static void circle(){
        System.out.println(" * *");
        System.out.println("*   *");
        System.out.println(" * *");
    }

    public static void triangle(){
        System.out.println("  *");
        System.out.println(" * *");
        System.out.println("* * *");
    }

    public static void square(){
        System.out.println("* * *");
        System.out.println("* * *");
        System.out.println("* * *");
    }
}
