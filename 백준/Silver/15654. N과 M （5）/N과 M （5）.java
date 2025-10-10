import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] numbers;
    static boolean[] checked;
    static int[] output;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        numbers = new int[n];
        checked = new boolean[n];
        output = new int[m];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers); // 사전순 오름차순
        perm(0);
        System.out.println(sb);
    }



    static void perm(int depth) {
        // base case
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(output[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        // recursive case
        for (int i = 0; i < n; i++) {
            if (!checked[i]) {
                checked[i] = true;
                output[depth] = numbers[i];
                perm(depth + 1);
                checked[i] = false;
            }
        }

    }
}