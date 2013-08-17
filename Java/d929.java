import java.util.Scanner;
public class d929 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            for (int i = 0; i < n; i++) {
                String str = cin.next();
                reverse(str);
            }
        }
    }

    public static void reverse(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("no");
                break;
            }
            i++;
            j--;
        }

        if (i >= j) {
            System.out.println("yes");
        }
    }
}
