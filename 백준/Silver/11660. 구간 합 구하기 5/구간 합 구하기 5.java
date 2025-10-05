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

        int[][] acc = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
        st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= N; j++){ // O(N^2)
            acc[i][j] = acc[i-1][j] + acc[i][j-1] - acc[i-1][j-1] + Integer.parseInt(st.nextToken());
            }
        }

        while(M-->0){ // O(M)
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int sum = acc[x2][y2] - acc[x1-1][y2] - acc[x2][y1-1] + acc[x1-1][y1-1];
            sb.append(sum).append("\n");// O(1)
        } // O(M) * O(1) = O(M)

        System.out.println(sb); // O(M)

        } // O(N^2) + O(M) + O(M) = O(N^2)
}