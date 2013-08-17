import java.util.Scanner;
public class d594 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            for (int i = 0; i < n; i++) {
                int a = cin.nextInt();
                int b = cin.nextInt();
                System.out.println((a + b) * 2);
            }
        }
    }
}
