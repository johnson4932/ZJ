import java.util.Scanner;

public class d051 {
	public static void main(String [] argv) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			long n = in.nextInt();
			System.out.printf("%.3f\n",(n-32)*5/9.0);
		}
	}
}