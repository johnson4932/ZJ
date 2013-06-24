import java.util.Scanner;
public class a024 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            System.out.println(gcd(a,b));
        }
    }

    public static int gcd(int a, int b) {
        while (a%b != 0) {
            int c = a%b;
            a = b;
            b = c;
        }
        return b;
    }
}
