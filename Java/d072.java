import java.util.Scanner;
public class d072 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            for (int i = 1; i <= n; i++) {
                int year = cin.nextInt();
                String str = "";
                if (year%4 == 0 && year%100 !=0 || year%400 == 0) {
                    str = "a leap year";
                } else {
                    str = "a normal year";
                }
                System.out.println("Case " + i + ": " + str);
            }
        }
    }
}
