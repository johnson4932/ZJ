import java.util.Scanner;

public class b222 {
	public static void main(String [] argv) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String answer = in.next();
			int [] answer_arr = convert(answer);

			int n = in.nextInt();
			for (int i = 0; i < n; i++) {
				String intput = in.next();
				int [] input_arr = convert(intput);

				int a = 0;
				int b = 0;
				for (int j = 0; j < 4; j++) {
					for (int k = 0; k < 4; k++) {
						if (answer_arr[k] == input_arr[j]) {
							if (j == k) {
								a++;
							} else {
								b++;
							}
						}
					}
				}
				System.out.println(a + "A" + b + "B");
			}
		}
	}

	public static int [] convert(String num) {
		int [] arr = new int[4];
		for (int i = 0; i < 4; i++) {
			arr[i] = (int)(num.charAt(i) - '0');
		}

		return arr;
	}
}
