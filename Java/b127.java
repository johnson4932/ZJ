import java.util.Scanner;

public class b127 {
	public static void main(String [] argv) {
		Scanner in = new Scanner(System.in);
		int [] arr = fibonacci();
		while (in.hasNext()) {
			int n = in.nextInt();
			System.out.println(arr[n]);
		}
	}
	
	public static int [] fibonacci() {
		int [] arr = new int[46];
		arr[0] = arr[1] = 1;
		
		for (int i = 2; i < 46; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		return arr;
	}
}