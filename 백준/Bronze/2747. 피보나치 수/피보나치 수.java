import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = fibo(n);
        System.out.println(result);
    }

    static int[] cache = new int[50];

    static int fibo(int n) {
        // base case
        if (n == 1 || n == 2) return 1;
        if (cache[n] != 0) return cache[n];
        // recursive case
        cache[n] = fibo(n - 1) + fibo(n - 2);
        return cache[n];
    }
}