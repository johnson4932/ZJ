import java.util.Scanner;
public class d074 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int max = 0;
            for (int i = 0; i < n; i++) {
                int m = cin.nextInt();
                if (max < m) {
                   max = m;
                }
            }
            System.out.println(max);
        }
    }
}
