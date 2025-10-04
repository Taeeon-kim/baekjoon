import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N+1];
        int[] acc = new int[N+1];
        for(int i=1;i<=N;i++){ // O(N)
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i <= N; i++) { // O(N)
            acc[i] = acc[i-1] + arr[i];
        }

        while(M-->0){ // O(M)
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(acc[j]-acc[i-1]); // O(1)
        } // O(M) * O(1) = O(M)
        }

}