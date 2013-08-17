import java.util.Scanner;
public class a215 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            int count = 0;
            int total = 0;
            while (total <= m) {
                total += n + count;
                count++;
            }
            System.out.println((n > m) ? (1) : (count));
        }
    }
}
