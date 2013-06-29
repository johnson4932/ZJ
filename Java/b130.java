import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class b130 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                int num = cin.nextInt();
                if (!list.contains(num)) {
                    list.add(num);
                }
            }
            Collections.sort(list);

            System.out.println(list.size());

            Iterator it = list.iterator();
            while(it.hasNext()){
                System.out.print(it.next() + " ");
            }
            System.out.println();
        }
    }
}
