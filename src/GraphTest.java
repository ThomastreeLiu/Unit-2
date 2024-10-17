
public class GraphTest {
    public static void main(String[] args){
        int i = 1;
        while(1==1) {
            if (i == 1) {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");
                System.out.println("-------\n|  |  |\n|     |\n|     |\n-------");
                i=i+1;
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (i == 2) {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");
                System.out.println("-------\n|     |\n|  |  |\n|     |\n-------");
                i=i+1;
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (i == 3) {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");
                System.out.println("-------\n|     |\n|     |\n|  |  |\n-------");
                i=i+1;
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (i == 4) {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");
                System.out.println("-------\n|     |\n|  |  |\n|     |\n-------");
                i=i+1;
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (i == 5) {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");
                System.out.println("-------\n|  |  |\n|     |\n|     |\n-------");
                i=1;
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
