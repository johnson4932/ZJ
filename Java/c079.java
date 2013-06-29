import java.util.Scanner;
public class c079 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int k = cin.nextInt();
            int total = n + n / k;
            int mod_smoke = n % k + n / k;
            while (mod_smoke >= k) {
                int smoke = mod_smoke / k;
                mod_smoke = mod_smoke % k + smoke;
                total += smoke;
            }
            System.out.println(total);
        }
    }
}
