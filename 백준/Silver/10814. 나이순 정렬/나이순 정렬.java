import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. Scanner로 받아서 해보고 최대 n 이 100,000 이니 bufferedReader, InputStreamReader 사용 차이볼것
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        User[] users = new User[N];
        for (int i = 0; i < N; i++) { // O(N)
            int age = sc.nextInt();
            String name = sc.next();
            users[i] = new User(count, name, age);
            count++;
        }

        // 2. sort
        Arrays.sort(users, (o1, o2) -> { // O(NlogN)
            if( o1.age == o2.age){
                return o1.idx - o2.idx;
            }
            return o1.age - o2.age;
        });

        for (User user : users) { // O(N)
            System.out.println(user.age + " " + user.name);
        }
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