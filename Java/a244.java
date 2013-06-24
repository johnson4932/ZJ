import java.util.Scanner;
public class a244 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            for (int i = 0; i < n; i++) {
                int a = cin.nextInt();
                long b = cin.nextInt();
                long c = cin.nextInt();

                long answer;

                switch(a) {
                    case 1:
                        answer = b + c;
                        break;
                    case 2:
                        answer = b - c;
                        break;
                    case 3:
                        answer = b * c;
                        break;
                    default:
                        answer = b / c;
                }
                System.out.println(answer);
            }
        }
    }
}
