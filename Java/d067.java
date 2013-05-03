import java.util.Scanner;

public class d067 {
	public static void main(String [] argv) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int year = in.nextInt();
			System.out.println((year%4==0 && year%100!=0 || year%400==0) ? ("a leap year") : ("a normal year"));
		}
	}
}