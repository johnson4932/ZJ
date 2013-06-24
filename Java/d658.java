import java.util.Scanner;
public class d658 {
    public static void main(String [] argv) {

        int [] arr = new int[15];
        arr[0] = 1;
        for (int i = 1; i < 15; i++) {
            arr[i] = arr[i-1] * 2;
        }

        int count = 1;
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            if (n < 0) {
                break;
            }

            for (int i = 0; i < 15; i++) {
                if (n <= arr[i]) {
                    System.out.println("Case " + count  + ": " + i);
                    count++;
                    break;
                }
            }
        }
    }
}
