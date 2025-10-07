import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> dq = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push_front":
                    dq.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    dq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    bw.write(dq.isEmpty() ? "-1\n" : dq.pollFirst() + "\n");
                    break;
                case "pop_back":
                    bw.write(dq.isEmpty() ? "-1\n" : dq.pollLast() + "\n");
                    break;
                case "size":
                    bw.write(dq.size() + "\n");
                    break;
                case "empty":
                    bw.write(dq.isEmpty() ? "1\n" : "0\n");
                    break;
                case "front":
                    bw.write(dq.isEmpty() ? "-1\n" : dq.peekFirst() + "\n");
                    break;
                case "back":
                    bw.write(dq.isEmpty() ? "-1\n" : dq.peekLast() + "\n");
                    break;
            }
        }
        bw.flush();

    }
}