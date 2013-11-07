import java.util.Scanner;
public class d392 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            long total = 0;
            String str = cin.nextLine();
            String [] arr = str.split("[\\s]+");
            for (String val : arr) {
                total += Integer.parseInt(val);
            }
            System.out.println(total);
        }
    }
}
