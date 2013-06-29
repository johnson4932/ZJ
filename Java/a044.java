import java.util.Scanner;
public class a044 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            System.out.println(n*(n*n+5)/6+1);
        }
    }
}
