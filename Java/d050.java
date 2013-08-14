import java.util.Scanner;
public class d050 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            System.out.println((n - 15 + 24) % 24);
        }
    }
}
