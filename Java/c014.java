import java.util.Scanner;
public class c014 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String a = cin.next();
            String b = cin.next();
            if (a.equals("0") && b.equals(a)) {
                break;
            }

            int [][] arr = new int[2][10];
            int count = 0;
            for (int i = 0; i < 2; i++) {
                String str = (i == 0) ? (a) : (b);
                int length = str.length() - 1;
                int arr_index = 9;
                while (length >= 0) {
                    arr[i][arr_index] = (str.charAt(length) - '0');
                    arr_index--;
                    length--;
                }
            }

            for (int i = 9; i >= 0; i--) {
                int total = arr[0][i] + arr[1][i];
                if (total >= 10) {
                    count++;
                    arr[0][i - 1]++;
                }
            }

            if (count == 0) {
                System.out.println("No carry operation.");
            } else if (count == 1) {
                System.out.println(count + " carry operation.");
            } else {
                System.out.println(count + " carry operations.");
            }
        }
    }
}
