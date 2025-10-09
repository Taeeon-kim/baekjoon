import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        int result = 0;
        int openedCount = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == '(') openedCount++;
            else if (input[i] == ')') {
                if (input[i - 1] == '(') {
                    openedCount--;
                    result += openedCount;
                }
                else {
                    openedCount--;
                    result++;
                }
            }
        }
        System.out.print(result);
    }
}