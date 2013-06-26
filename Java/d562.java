import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class d562 {
	public static void main(String [] argv) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			List<Integer> arr = new LinkedList<Integer>();
			for (int i = 0; i < n; i++) {
				arr.add(in.nextInt());
			}

			int length = arr.size() - 1;
			while (length >= 0) {
				String answer = "";
				for (int i = 0; i <= length; i++) {
					answer += arr.get(i) + " ";
				}
				answer += "\n";
				arr.remove(0);
				length--;

				for (int i = length; i >= 0; i--) {
					answer += arr.get(i) + " ";
				}
				answer += "\n";
				length--;
				System.out.print(answer);
			}
			System.out.println();
		}
	}
}
