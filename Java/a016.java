import java.util.Scanner;
public class a016 {
    public static void main(String [] argv) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            // Init Sudoku
            int [][] sudoku = new int[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sudoku[i][j] = cin.nextInt();
                }
            }

            // Check
            if (checkHorizontal(sudoku) && checkVertical(sudoku) && checkArea(sudoku)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    private static boolean checkNum(int [] numArr) {
        for (int i = 0; i <= 9; i++) {
            if (numArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkHorizontal(int [][] sudoku) {
        for (int i = 0; i  < 9; i++) {
            int [] numArr = {0,1,1,1,1,1,1,1,1,1};
            for (int j = 0; j < 9; j++) {
                numArr[sudoku[i][j]]--;
            }

            if (!checkNum(numArr)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkVertical(int [][] sudoku) {
        for (int i = 0; i  < 9; i++) {
            int [] numArr = {0,1,1,1,1,1,1,1,1,1};
            for (int j = 0; j < 9; j++) {
                numArr[sudoku[j][i]]--;
            }

            if (!checkNum(numArr)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkArea(int [][] sudoku) {
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                int [] numArr = {0,1,1,1,1,1,1,1,1,1};
                for (int k = i; k <= i + 2; k++) {
                    for (int l = j; l <= j + 2; l++) {
                        numArr[sudoku[k][l]]--;
                    }
                }

                if (!checkNum(numArr)) {
                    return false;
                }
            }
        }
        return true;
    }
}
