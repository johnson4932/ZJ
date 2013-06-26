import java.util.Scanner;

public class a015 {
	public static void main(String [] argv) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			int m = in.nextInt();
			int [][] arr = new int[n][m];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					arr[i][j] = in.nextInt();
				}
			}

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(arr[j][i] + " ");
				}
				System.out.println();
			}
		}
	}
}
