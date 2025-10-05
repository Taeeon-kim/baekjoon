import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(sc.nextInt()); // OS 부담고려
        }

        int M =sc.nextInt();
        while(M-->0){
            int x = sc.nextInt();
            System.out.println(set.contains(x) ? 1 : 0);
        }
        
    }
}