import java.util.Scanner;

public class d066 {
	public static void main(String [] argb) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int hour = in.nextInt();
			int minute = in.nextInt();
			if (hour >= 17 || hour < 7 || hour == 7 && minute < 30) {
				System.out.println("Off School");
			} else {
				System.out.println("At School");
			}
		}
	}
}
