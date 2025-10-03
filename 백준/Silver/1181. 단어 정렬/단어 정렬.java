import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 1. 입력을 Scanner로 받기
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(scanner.next());
        }
        
        String[] words = set.stream().toArray((size) -> new String[size]);

        // 1-1. 시간성능확인후 StringBuild로도 바꿔서 StringBuild buffered? 사용
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
            System.out.println(word);
        }
    }
}