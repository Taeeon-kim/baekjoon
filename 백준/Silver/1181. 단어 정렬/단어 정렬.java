import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // 1. 입력을 Scanner로 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        String[] words = set.stream().toArray((size) -> new String[size]);

  
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               if(o1.length() == o2.length()){
                   return o1.compareTo(o2);
               }
                return o1.length() - o2.length();
            }
        });
        for (String word : words) {
            sb.append(word).append("\n");
        }
        System.out.println(sb);
    }
}