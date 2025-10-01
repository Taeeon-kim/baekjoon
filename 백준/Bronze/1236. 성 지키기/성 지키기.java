import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().toCharArray();
        }
        int existRowCount = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (arr[r][c] == 'X') {
                    existRowCount++;
                    break;
                }
            }
        }

        int existColCount = 0;
        for (int c = 0; c < m; c++) {
            for (int r = 0; r < n; r++) {
                if (arr[r][c] == 'X') {
                    existColCount++;
                    break;
                }
            }
        }

        int needeRowCount = n - existRowCount;
        int needeColCount = m - existColCount;

        System.out.println(Math.max(needeRowCount, needeColCount));

    }
}