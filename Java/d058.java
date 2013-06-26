import java.util.Scanner;

public class d058 {
	public static void main(String [] argv) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			System.out.println((n == 0) ? (0) : ((n > 0) ? (1) : (-1)));
		}
	}
}
