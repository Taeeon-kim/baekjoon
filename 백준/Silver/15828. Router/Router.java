import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int bufferSize = Integer.parseInt(br.readLine());
        Queue<String> queue = new ArrayDeque<>(bufferSize);

        while (true) {
            String task = br.readLine(); // 이렇게했을때랑 Integer.parseInt해서 실제 정수로하는거 시간차이 보기
            if (task.equals("-1")) {
                break;
            }
            if (task.equals("0")) {
                if (queue.isEmpty()) continue;
                queue.poll();
            } else {
                if (queue.size() == bufferSize) {
                    continue;
                }
                queue.offer(task);
            }
        }
        if (queue.isEmpty()) {
            System.out.println("empty");
        } else {
          StringBuilder sb = new StringBuilder();
            queue.forEach((task) -> sb.append(task).append(" "));
            System.out.print(sb);
        }
    }
}