import java.util.Scanner;

public class c002 {
	public static void main(String [] argv) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			if (n == 0) {
				break;
			}
			System.out.println("f91(" + n + ") = " + f91(n));
		}
	}
	
	public static int f91(int n) {
		if (n <= 100) {
			return f91(f91(n+11));
		} else {
			return n - 10;
		}
	}
}