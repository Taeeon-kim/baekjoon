import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> q = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int lastValue = -1;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            switch (cmd) {
                case "push":
                    lastValue = Integer.parseInt(st.nextToken());
                    q.offer(lastValue);
                    break;
                case "pop":
                    bw.write(q.isEmpty() ? "-1\n" : q.poll() + "\n");
                    break;
                case "size":
                    bw.write(q.size() + "\n");
                    break;
                case "empty":
                    bw.write(q.isEmpty() ? "1\n" : "0\n");
                    break;
                case "front":
                    bw.write(q.isEmpty() ? "-1\n" :q.peek() + "\n");
                    break;
                case "back":
                    bw.write(q.isEmpty() ? "-1\n" : lastValue + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();

    }
}