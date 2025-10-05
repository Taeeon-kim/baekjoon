import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) { // O(N)
            set.add(br.readLine());
        }

        int resultCount = 0;
        for (int i = 0; i < M; i++) { // O(M)
            if (set.contains(br.readLine())) {
                resultCount++;
            }
        } // O(M) + O(N) = O(M + N) = 20,000

        System.out.print(resultCount);
    }
}