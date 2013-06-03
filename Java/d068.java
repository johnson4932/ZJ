import java.util.Scanner;
public class d068 {
    public static void main (String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            System.out.println((n > 50) ? (n - 1) : (n));
        }
    }
}
