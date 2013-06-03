import java.util.Scanner;
public class d070 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            if (n != 0) {
                String str;
                if (n%4 == 0 && n%100 != 0 || n%400 == 0) {
                    str = "a leap year";
                } else {
                    str = "a normal year";
                }
                System.out.println(str);
            } else {
                break;
            }
        }
    }
}
