import java.util.Scanner;

public class a007 {
	public static void main(String [] argv) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			boolean prime = true;
			
			for (int i = 2; i <= (int)Math.sqrt(n); i++) {
				if (n%i == 0) {
					prime = false;
					break;
				}
			}
			
			if (prime) {
				System.out.println("質數");
			} else {
				System.out.println("非質數");
			}
		}
	}
}