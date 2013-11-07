import java.util.Scanner;
public class d956 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int num = cin.nextInt();
            for (int i = 0; i < num; i++) {
                String str = cin.next();
                String [] arr = str.split("\\+");
                int total = 0;
                for (String val : arr) {
                    total += multiply(val);
                }
                System.out.println(total);
            }
        }
    }

    public static int multiply(String str) {
        String [] arr = str.split("\\*");
        int total = 1;
        for (String val : arr) {
            total *= Integer.parseInt(val);
        }
        return total;
    }
}
