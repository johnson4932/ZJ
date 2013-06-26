import java.util.Scanner;

public class a009 {
	public static void main(String [] argv){
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String str = in.next();
			for (int i = 0; i < str.length(); i++) {
				System.out.print((char)(str.charAt(i) - 7));
			}
			System.out.println();
		}
	}
}
