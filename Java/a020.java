import java.util.Scanner;
public class a020 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        int [] en_map = {10,11,12,13,14,15,16,17,34,18,19,20,21,22,35,23,24,25,26,27,28,29,32,30,31,33};
        while (cin.hasNext()) {
            String person_ID = cin.next();
            int en_num = en_map[person_ID.charAt(0) - 'A'];
            int total = (en_num / 10) + (en_num % 10 * 9);
            for (int i = 1; i <= 8; i++) {
                total += (person_ID.charAt(i) - '0') * (9 - i);
            }
            total += (person_ID.charAt(9) - '0');

            System.out.println((total % 10 == 0) ? ("real") : ("fake"));
        }
    }
}
