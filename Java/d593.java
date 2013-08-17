import java.util.Scanner;
public class d593 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            for (int i = 0; i < n; i++) {
                String str = cin.next();
                int num = lifeNumber(str);
                if (num == 2) {
                    System.out.println("2, Yes");
                } else {
                    System.out.println(num + ", No");
                }
            }
        }
    }

    public static int lifeNumber(String n) {
        int total = 0;
        for (int i = 0; i < n.length(); i++) {
            total += n.charAt(i) - '0';
        }

        if (total < 10) {
            return total;
        } else {
            return lifeNumber(Integer.toString(total));
        }
    }
}
