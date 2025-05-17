import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // 버퍼 처리

        String[] mirror = new String[N];
        for (int i = 0; i < N; i++) {
            mirror[i] = sc.nextLine();
        }

        int K = sc.nextInt();

        if (K == 1) {
            for (String line : mirror) {
                System.out.println(line);
            }
        } else if (K == 2) {
            for (String line : mirror) {
                System.out.println(reverseString(line));  // 좌우 반전
            }
        } else if (K == 3) {
            for (int i = N - 1; i >= 0; i--) {           // 상하 반전
                System.out.println(mirror[i]);
            }
        }
    }

    // 문자열 좌우 반전용 함수
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}