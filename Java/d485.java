import java.util.Scanner;
public class d485 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            if (a % 2 == 1 && b % 2 == 1) {
                System.out.println((b - a) / 2);
            } else {
                System.out.println((a!=0 && a == b && a%2==1)? 0:(b-a)/2+1);
            }
        }
    }
}
