import java.util.Scanner;
public class c006 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            int c = cin.nextInt();
            int d = cin.nextInt();
            if (a + b + c + d == 0) {
                break;
            }

            //Step 0
            int sum = 360 * 3;

            //Step 1
            sum += (40 + a - b) % 40 * 9;

            //Step 2
            sum += (40 + c - b) % 40 * 9;

            //Step 3
            sum += (40 + c - d) % 40 * 9;

            System.out.println(sum);
        }
    }
}
