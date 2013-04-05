import java.util.Scanner;

public class a005 {
	public static void main(String [] argv) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			for (int i = 0; i < n; i++) {
				int [] arr = new int[4];
				for (int j = 0; j < 4; j++) {
					arr[j] = in.nextInt();
					System.out.print(arr[j] + " ");
				}
				
				if (arr[3] - arr[2] == arr[2] - arr[1]) {
					int difference = arr[2] - arr[1];
					System.out.println(arr[3] + difference);
				} else {
					int difference = arr[2] / arr[1];
					System.out.println(arr[3] * difference);
				}
			}
		}
	}
}