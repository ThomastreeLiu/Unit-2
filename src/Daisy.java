public class Daisy {
    public static void main (String[] args){
        int lastnum = (int)(Math.random()*24)+15;
        for (int i = 0;i<lastnum;i++){
            if (i%2==0)
                System.out.println("They love me");
            else
                System.out.println("They love me not");
        }
    }
}
