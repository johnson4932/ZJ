import java.util.Scanner;
public class d098 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String str;
            while( (str = cin.nextLine()).equals("") );
            String [] str_arr = str.split(" ");
            int total = 0;
            for (int i = 0; i < str_arr.length; i++) {
                if (!str_arr[i].matches(".*[\\D]+.*")) {
                    //輸入中文會有問題，所以還是會有空字串切進來
                    //排除空字串
                    if(str_arr[i].equals("")){
                        continue;
                    }
                    total += Integer.parseInt(str_arr[i]);
                }
            }
            System.out.println(total);
        }
    }
}
