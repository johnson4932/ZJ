import java.util.Scanner;
public class d073 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            System.out.println((n%3 == 0) ? (n/3) : ((int)n/3 + 1));
        }
    }
}
