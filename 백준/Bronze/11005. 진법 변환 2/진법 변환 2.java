import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 10진수
        int B = sc.nextInt(); // B진수
        String ans = "";
        while (N > 0) {
            int digit = N % B;
            if(digit < 10){
                ans = ans + digit;
            } else {
                ans = ans + (char)('A' + digit - 10);
            }
            N /= B;
        }

        for(int i = ans.length() - 1; i >= 0; i--){
            System.out.print(ans.charAt(i));
        }

    }
}