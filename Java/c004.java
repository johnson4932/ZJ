import java.util.Scanner;
public class c004 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            for (int i = 0; i < n; i++) {
                int sum = cin.nextInt();
                int diff = cin.nextInt();

                if (sum >= diff) {
                    int y = (sum - diff) / 2;
                    int x = diff + y;
                    if (x + y != sum) {
                        System.out.println("impossible");
                    } else {
                        System.out.println(x + " " + y );
                    }
                } else {
                    System.out.println("impossible");
                }
            }
        }
    }
}
