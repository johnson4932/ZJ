import java.util.Scanner;
public class c013 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            for (int count = 0; count < n; count++) {
                int a = cin.nextInt();
                int f = cin.nextInt();
                waves(a,f);
            }
        }
    }

    public static void waves(int a, int f) {
        for (int count = 1; count <= f; count++) {
            for (int i = 1; i <= a; i++) {
                showLine(i);
            }
            for (int i = a - 1; i >= 1; i--) {
                showLine(i);
            }
            System.out.println();
        }
    }

    public static void showLine(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(num);
        }
        System.out.println();
    }
}
