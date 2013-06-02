import java.util.Scanner;
public class a227
{
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            hanoi(n, 'A', 'B', 'C');
            System.out.println();
        }
    }

    public static void hanoi(int n, char start, char temp, char end) {
        if(n > 0){
            //將所有盤子移到暫存區
            hanoi(n - 1, start, end, temp);
            //將最後一個盤子移到目的區
            display(n, start, end);
            //把暫存區的盤子移回目的區
            hanoi(n - 1, temp, start, end);
        }
    }

    public static void display(int n, char start, char end) {
        System.out.println("Move ring " + n + " from " + start + " to " + end);
    }
}
