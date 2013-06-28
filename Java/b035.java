import java.util.Scanner;
public class b035 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            if (n == 0) {break;}

            int total = 0;
            for (int i = 0; i < n; i++) {
                int len = cin.nextInt();
                total += len * len;
            }
            System.out.println(total);
        }
    }
}
