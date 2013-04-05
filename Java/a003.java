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
					str = "´¶³q";
					break;
				case 1:
					str = "¦N";
					break;
				default:
					str = "¤j¦N";
			}
			System.out.println(str);
		}
	}
}