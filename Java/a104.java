import java.util.Scanner;
import java.util.Arrays;
public class a104 {
    private static int [] arr;
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            arr = new int[n + 1];
            for (int i = 1; i < arr.length; i++) {
                arr[i] = cin.nextInt();
            }
            HeapSort();
        }
    }

    public static void HeapTree() {
        int len = arr.length - 1;
        int n = 1;
        while (n * 2 <= len) {
            int left = n * 2;
            int right = n * 2 + 1;

            if (arr[left] < arr[n]) {
                swap(left,n);
                BubbleSort(n);
            }

            if (right > len) {
                break;
            }

            if (arr[right] < arr[n]) {
                swap(right,n);
                BubbleSort(n);
            }
            n++;
        }
    }

    public static void BubbleSort(int n) {
        while (n / 2 > 0) {
            if (arr[n] < arr[n / 2]) {
                swap(n,n / 2);
            }
            n /= 2;
        }
    }

    public static void HeapSort() {
        HeapTree();
        int len = arr.length - 1;
        while (len > 0) {
            swap(1,len);
            System.out.print(arr[len] + " ");
            arr = Arrays.copyOf(arr, len--);
            HeapTree();
        }
        System.out.println();
    }

    public static void swap(int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
