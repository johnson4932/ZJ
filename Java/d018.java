import java.util.Scanner;
import java.text.DecimalFormat;
public class d018 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String str = cin.nextLine();
            String [] group = str.split(" ");
            double total = 0;
            for (String num : group) {
                String [] arr = num.split(":");
                int key = Integer.parseInt(arr[0]);
                double val = Double.parseDouble(arr[1]);
                total = (key % 2 == 0) ? (total -= val) : (total += val);
            }
            DecimalFormat formatter = new DecimalFormat("#.###");
            System.out.println(formatter.format(total));
        }
    }
}
