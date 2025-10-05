import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // usering Two Pointer
        int rightPointer = 0;
        int currentSum = arr[0];
        int answerCount = 0;
        for (int i = 0; i < N; i++) {
            while (currentSum < M && rightPointer < N - 1) {
                currentSum += arr[++rightPointer];
            }
            if (currentSum == M) {
                answerCount++;
            }
            currentSum -= arr[i];
        } // O(N)
        System.out.println(answerCount);
    }
}