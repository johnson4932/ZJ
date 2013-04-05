import java.util.Scanner;

public class c007 {
	public static void main(String [] argv) {
		Scanner in = new Scanner(System.in);
		boolean quote = true;
		while (in.hasNext()) {
			String str = in.nextLine();
			
			for (int i = 0; i < str.length(); i++) {
				char word = str.charAt(i);
				if (word == '"') {
					if (quote) {
						System.out.print("``");
					} else {
						System.out.print("''");
					}
					quote = !quote;
				} else {
					System.out.print(word);
				}
			}
			System.out.println();
		}
	}
}