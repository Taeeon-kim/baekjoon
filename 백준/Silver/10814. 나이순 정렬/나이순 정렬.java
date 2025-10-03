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
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            users[i] = new User(i, name, age);
        }

        // 2. sort
        Arrays.sort(users);

        for (User user : users) { // O(N)
            sb.append(user.age).append(" ").append(user.name).append("\n");
        }
        System.out.print(sb);
    } // O(NlogN) + O(N) + O(N) -> O(NlogN)

    public static class User implements Comparable<User> {
        @Override
        public int compareTo(User o) {
            return age - o.age;
        }

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