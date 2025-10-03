import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int[] ans = new int[7];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { // O(N)
            arr[i] = sc.nextInt();
        }

        for (int item : arr) sum += item; // O(N)
        
        outer:
        for (int i = 0; i < arr.length; i++) { // 등차수열 O(n(n-1)/2) = O(N^2)
            for (int j = i + 1; j < arr.length; j++) {
                if (sum - (arr[i] + arr[j]) == 100) {
                    int idx = 0;
                    for (int k = 0; k < arr.length; k++) {
                        if (k != i && k != j) {
                            ans[idx++] = arr[k];
                        }
                    }
                    break outer;
                }
            }
        } // O(N^2) * O(7) = O(N^2 * 7) -> O(N^2)

        for (int i = 0; i < ans.length; i++) { // n(n-1)/2 -> O(N^2)
            for (int j = i + 1; j < ans.length; j++) {
                if (ans[i] > ans[j]) {
                    int temp = ans[i];
                    ans[i] = ans[j];
                    ans[j] = temp;
                }
            }
        }
        for (int value : ans) { // O(N)
            System.out.println(value);
        }
    }
    // O(N^2) + O(N^2) + O(N) + O(N) + O(N)  = O(2N^2 + 3N) -> O(N^2)
}