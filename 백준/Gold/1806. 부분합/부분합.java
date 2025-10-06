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
        int[] arr = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] acc = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            acc[i] = acc[i - 1] + arr[i];
        }

        int result = Integer.MAX_VALUE;
        int left = 0, right = 1;

        while (right <= N) {
            int sum = acc[right] - acc[left];

            if (sum >= M) {
                result = Math.min(result, right - left);
                left++;  // 더 짧은 구간을 찾기 위해 왼쪽 포인터 이동
            } else {
                right++; // 합이 부족하니 오른쪽 포인터 이동
            }
        }
        if(result != Integer.MAX_VALUE){
                System.out.print(result);
        } else{
            System.out.print(0);
        }
    }
}