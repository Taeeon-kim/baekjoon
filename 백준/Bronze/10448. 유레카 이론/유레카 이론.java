import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseCount = sc.nextInt();
        int[] numbers = new int[caseCount];
        int[] result = new int[caseCount];
        for (int i = 0; i < caseCount; i++) {
            int n = sc.nextInt();
            numbers[i] = n;
        }

        for (int c = 0; c < caseCount; c++) {
            outer:
            for (int i = 1; i <= getNFromT(numbers[c]); i++) {
                for (int j = 1; j <= getNFromT(numbers[c]); j++) {
                    for (int k = 1; k <= getNFromT(numbers[c]); k++) {
                        if ((T(i) + T(j) + T(k)) == numbers[c]) {

                            result[c] = 1;
                            break outer;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < caseCount; i++) {
            System.out.println(result[i]);
        }


    }

    static int T(int n) {
        return n * (n + 1) / 2;
    }

    public static int getNFromT(int t) {
        double n = (-1 + Math.sqrt(1 + 8.0 * t)) / 2.0;
        return (int) n;
    }
}