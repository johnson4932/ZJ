import java.util.Scanner;
public class d491 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            int total = 0;
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }

            a = (a % 2 == 0) ? (a) : (a + 1);
            while (a <= b) {
                total += a;
                a += 2;
            }
            System.out.println(total);
        }
    }
}
