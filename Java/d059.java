import java.util.Scanner;
import java.lang.Math;
public class d059 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        int a,b;
        while (cin.hasNext()) {
            a = cin.nextInt();
            b = cin.nextInt();
            System.out.printf("%d\n",(int)Math.pow(a,b));

            a = cin.nextInt();
            System.out.printf("%.3f\n",Math.sqrt(a));

            a = cin.nextInt();
            System.out.println(Math.abs(a));

            a = cin.nextInt();
            b = cin.nextInt();
            System.out.println(Math.random()*b + a);
        }
    }
}
