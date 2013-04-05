import java.util.Scanner;

public class a004 {
	public static void main(String [] argv) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int year = in.nextInt();
			String str = "";
			if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
				str = "¶|¦~";
			} else {
				str = "¥­¦~";
			}
			System.out.println(str);
		}
	}
}