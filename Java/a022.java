import java.util.Scanner;
public class a022 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String str = cin.next();
            int i = 0;
            int j = str.length() - 1;
            String reverse = "yes";
            while (i < j) {
                if (str.charAt(i) != str.charAt(j)) {
                    reverse = "no";
                    break;
                }
                i++;
                j--;
            }
            System.out.println(reverse);
        }
    }
}
