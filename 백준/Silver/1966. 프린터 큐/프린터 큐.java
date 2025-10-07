import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int taskCase = Integer.parseInt(br.readLine());
        int[] result = new int[taskCase];
        for (int i = 0; i < taskCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            Queue<Job> arr = new ArrayDeque<>();
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr.offer(new Job(j, Integer.parseInt(st.nextToken())));
            }
            for (int k = 0; k < N; k++) {
                int max =  arr.stream()
                        .max((a,b)-> a.priority-b.priority)
                        .get().priority;

                while(!(arr.peek().priority == max)){
                    arr.offer(arr.poll());
                }

                if(arr.peek().index == M){
                    System.out.println(k+1);
                    break;
                }
                arr.poll();
            }
            
        }
    }

    static class Job{
        int index;
        int priority;

        Job(int index, int priority){
            this.index = index;
            this.priority = priority;
        }
    }
}