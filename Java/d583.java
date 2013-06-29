import java.util.Scanner;
public class d583 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            for (int i = 1; i <= n; i++) {
                int m = cin.nextInt();
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
