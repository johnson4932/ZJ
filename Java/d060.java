import java.util.Scanner;
public class d060 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            System.out.println((60 - n + 25) % 60);
        }
    }
}
