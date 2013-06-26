import java.util.Scanner;

public class d064 {
	public static void main(String [] argv) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			if (n%2 == 1) {
				System.out.println("Odd");
			} else {
				System.out.println("Even");
			}
		}
	}
}
