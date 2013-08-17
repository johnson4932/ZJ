import java.util.Scanner;
public class a011 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String str = cin.nextLine();
            String [] arr = str.split("[^a-zA-Z]+");
            System.out.println(arr.length);
        }
    }
}
