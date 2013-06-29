import java.util.Scanner;
public class c005 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            for (int i = 0; i < n; i++) {
                int person = cin.nextInt();
                double total = 0;
                for (int j = 0; j < person; j++) {
                    double area = cin.nextDouble();
                    int animal = cin.nextInt();
                    int level = cin.nextInt();
                    total += (area/animal)*level*animal;
                }
                System.out.printf("%.0f\n",total);
            }
        }
    }
}
