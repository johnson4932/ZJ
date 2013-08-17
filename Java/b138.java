import java.util.Scanner;
public class b138 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int [] tree_height = new int[10];
            for (int i = 0; i < 10; i++) {
                tree_height[i] = cin.nextInt();
            }
            int height = cin.nextInt();

            int count = 0;
            for (int apple:tree_height) {
                if (height + 30 >= apple) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
