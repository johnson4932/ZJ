import java.util.Scanner;
public class a147 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            if (n == 0) {
                break;
            }

            for (int i = 1; i < n; i ++) {
                if (i % 7 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
