import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. Scanner로 받아서 해보고 최대 n 이 100,000 이니 bufferedReader, InputStreamReader 사용 차이볼것
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        User[] users = new User[N];
        for (int i = 0; i < N; i++) { // O(N)
            String[] tokens = br.readLine().split(" ");
            int age = Integer.parseInt(tokens[0]);
            String name = tokens[1];
            users[i] = new User(i, name, age);
        }

        // 2. sort
        Arrays.sort(users, (o1, o2) -> { // O(NlogN)
            if( o1.age == o2.age){
                return o1.idx - o2.idx;
            }
            return o1.age - o2.age;
        });

        for (User user : users) { // O(N)
            sb.append(user.age).append(" ").append(user.name).append("\n");
        }
        System.out.print(sb);
    } // O(NlogN) + O(N) + O(N) -> O(NlogN)

    public static class User {
        int idx;
        String name;
        int age;

        public User(int idx, String name, int age) {
            this.idx = idx;
            this.name = name;
            this.age = age;
        }
    }
}