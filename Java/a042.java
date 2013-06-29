import java.util.Scanner;
public class a042 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            System.out.println(n*(n-1)+2);
        }
    }
}
