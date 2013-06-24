import java.util.Scanner;
public class a216 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            System.out.println(f(n) + " " + g(n));
        }
    }

    //f(n) = n + f(n-1)   ===  f(n) = n(n+1)/2
    public static long f(int n) {
        return n * (n + 1) / 2;
    }

    //g(n) = f(1)+f(2)+f(3)+...+f(n)
    public static long g(int n) {
        long total = 0;
        for (int i = 1; i <= n; i++) {
            total += f(i);
        }
        return total;
    }
}
