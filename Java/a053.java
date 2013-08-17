import java.util.Scanner;
public class a053 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int score;
            if (n <= 10) {
                score = n * 6;
            } else if (n > 10 && n <= 20) {
                score = 6 * 10 + (n - 10) * 2;
            } else if (n > 20 && n < 40) {
                score = 6 * 10 + 2 * 10 + (n - 20);
            } else {
                score = 100;
            }
            System.out.println(score);
        }
    }
}
