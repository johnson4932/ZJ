import java.util.Scanner;
public class a148 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            double total = 0;
            String nopass = "yes";
            for (int i = 0; i < n; i++) {
                total += cin.nextInt();
            }

            if (total/n > 59.0) {
                nopass = "no";
            }
            System.out.println(nopass);
        }
    }
}
