import java.util.Scanner;
public class d584 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            if (n == 0) {
                System.out.println(0);
            } else {
                int point = (n == 2) ? ((m - 8) * 3 + 1) : ((m - 10) * 3 + 1);
                if (m >= 30) {point++;}
                if (m >= 70) {point++;}
                if (m >= 120) {point += 3;}
                System.out.println(point);
            }
        }
    }
}
