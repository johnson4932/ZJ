import java.util.Scanner;

public class a006 {
	public static void main(String [] argv) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();

			double b2_4ac = b*b - 4*a*c;
			String str = "";
			if (b2_4ac > 0) {
				double x1 = (-b+Math.sqrt(b2_4ac)) / (2*a);
				double x2 = (-b-Math.sqrt(b2_4ac)) / (2*a);
				str = "Two different roots x1=" + (int)x1 + " , x2=" + (int)x2;
			} else if (b2_4ac < 0) {
				str = "No real root";
			} else {
				str = "Two same roots x=" + (int)((-b+Math.sqrt(b2_4ac)) / (2*a));
			}
			System.out.println(str);
		}
	}
}
