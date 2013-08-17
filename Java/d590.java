import java.util.Scanner;
public class d590 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            if (n == 0 && n == m) {
                break;
            }

            if (n % 2 == m % 2) {
                System.out.println("Win");
            } else {
                System.out.println("Loss");
            }
        }
    }
}
