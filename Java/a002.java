import java.util.Scanner;

public class a002 {
	public static void main(String [] argv){
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(a + b);
		}
	}
}