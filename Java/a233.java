import java.util.Scanner;
public class a233 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int [] arr = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = cin.nextInt();
            }

            arr = heapSort(arr);

            for (int i = 1; i <= n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static int [] heapSort(int [] arr) {
        int length = arr.length - 1;
        while (length > 1) {
            arr = swap(arr,1,length);
            length--;
            int parent = 1;
            int leaf = parent * 2;
            while (leaf <= length) {
                if (leaf < length && arr[leaf + 1] < arr[leaf]) {
                    leaf++;
                }
                if (arr[parent] <= arr[leaf]) {
                    break;
                }

                arr = swap(arr,parent,leaf);
                parent = leaf;
                leaf = parent * 2;
            }
        }
        return arr;
    }

    public static int [] swap(int [] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
}
