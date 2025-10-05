import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) { // O(N)
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        // usering Two Pointer
        int rightPointer = arr.length - 1;
        int[] answerArr = {arr[0], arr[rightPointer]};

        int min = Math.abs(arr[0] + arr[rightPointer]); // 초기화
        for (int i = 0; i < N; i++) { // O(N)
           while(i < rightPointer){ // O(N)
               int value = arr[i] + arr[rightPointer];
                 if(Math.abs(value) < min){
                    min = Math.abs(value);
                    answerArr[0] = arr[i];
                    answerArr[1] = arr[rightPointer];
                    if(value == 0) {
                        System.out.print(answerArr[0] + " " + answerArr[1]);
                        return;
                    }
                 }
                 if(value > 0){
                     rightPointer--;
                 } else{
                     break;
                 }
           }
        }
        System.out.print(answerArr[0] + " " + answerArr[1]);
    } // O(N)
}