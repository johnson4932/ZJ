import java.util.Scanner;
public class c022 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            for (int i = 1; i <= n; i++) {
                int a = cin.nextInt();
                int b = cin.nextInt();
                int sum = 0;
                int begin = (a % 2 == 0) ? (a + 1) : (a);

                while (begin <= b) {
                    sum += begin;
                    begin += 2;
                }
                System.out.println("Case " + i  + ": " + sum);
            }
        }
    }
}
