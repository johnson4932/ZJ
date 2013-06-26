import java.util.Scanner;

public class a003 {
	public static void main(String [] argv) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int m = in.nextInt();
			int d = in.nextInt();
			String str = "";
			switch ((m*2+d)%3) {
				case 0:
					str = "普通";
					break;
				case 1:
					str = "吉";
					break;
				default:
					str = "大吉";
			}
			System.out.println(str);
		}
	}
}
