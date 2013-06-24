import java.util.Scanner;
public class a038 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String str = cin.next();
            String reverse = "";
            int len = str.length() - 1;
            while (len >= 0) {
                reverse += str.charAt(len);
                len--;
            }
            System.out.println(Integer.parseInt(reverse));
        }
    }
}
