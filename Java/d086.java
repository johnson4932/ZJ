import java.util.Scanner;
public class d086 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String str = cin.next().toUpperCase();
            if (str.equals("0")) {break;}
            int total = 0;
            Boolean fail = false;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch < 'A' || ch > 'Z') {
                    fail = true;
                    break;
                } else {
                    total += (ch - 'A') + 1;
                }
            }

            if (fail) {
                System.out.println("Fail");
            } else {
                System.out.println(total);
            }
        }
    }
}

