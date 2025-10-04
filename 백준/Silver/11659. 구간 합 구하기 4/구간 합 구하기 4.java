import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] acc = new int[N+1];
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) { // O(N)
            acc[i] = acc[i-1] + Integer.parseInt(st.nextToken());
        }

        while(M-->0){ // O(M)
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            sb.append(acc[j]-acc[i-1]).append("\n");// O(1)
        } // O(M) * O(1) = O(M)

        System.out.println(sb); // O(M)

        } // O(N) + O(M) + O(M) = O(N+M)
}