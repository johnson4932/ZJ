import java.util.Scanner;
public class b186 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int cookie = cin.nextInt();
            int chocolate = cin.nextInt();
            int cake = cin.nextInt();

            int n = cookie / 10;
            int m = cake / 2;
            chocolate = (n > m) ? (chocolate + m) : (chocolate + n);

            System.out.println(cookie + " 個餅乾，" + chocolate  + " 盒巧克力，" + cake + " 個蛋糕。");
        }
    }
}
