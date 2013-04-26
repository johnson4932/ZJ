import java.util.Scanner;

public class d065 {
	public static void main(String [] argv) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int max = (a >= b)?((a >= c)?(a):(c)):((b >= c)?(b):(c));
			System.out.println(max);
		}
	}
}