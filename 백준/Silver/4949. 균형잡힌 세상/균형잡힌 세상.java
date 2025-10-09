import java.io.*;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // input arr[] ->가변이므로 가변 어레이로
        ArrayList<String> sentenceList = new ArrayList<>();
        // ---- 입력 조건 ---

        while (true) {
            // 입력하나 받음 br.readLine();
            String sentence = br.readLine();
            // 1. if(string.equals(".")) break;
            if (sentence.equals(".")) break;
            // 2. size >1 && string equal("."); 이면 arr[] 에 해당 String add 후 pass (continue), 아무동작없음을 표시
            if (sentence.length() > 1) {
                sentenceList.add(sentence);

            }

        }

        // -- 출력 조건 ---
        // arr 을 for문 사용

        for (String sentence : sentenceList) {// 해당입력 toCharArray() 만듬
            // stack 입력 두개, 소괄호용, 대괄호용
            Deque<Character> stack = new LinkedList<>();

            char[] charSentence = sentence.toCharArray();
            // isBalance = true; 로 초기화 후 추후 균형 문장인지 체크
            boolean isBalance = true;

            // 2. For문 charSentence를 하나하나 체크 O(N), 만약 "[" 또는 "(" 만날시 push, "]", ")" 만날시 pop
            for (char c : charSentence) {
                if (c == '(') {
                    stack.push('(');
                } else if (c == '[') {
                    stack.push('[');
                } else if (c == ')') {
                    // 3. "]" 또는 ")" 만났을때 해당 stack empty면 isBalance = false
                    if (stack.isEmpty()) {
                        isBalance = false;
                        break;
                    }
                    Character popChar = stack.pop();
                    if (popChar != '(') {
                        isBalance = false;
                        break;
                    }
                } else if (c == ']') {
                    if (stack.isEmpty()) {
                        isBalance = false;
                        break;
                    }
                    Character popChar = stack.pop();
                    if (popChar != '[') {
                        isBalance = false;
                        break;
                    }
                } else if (c == '.') { // 또는 "."만났을때 stack이 empty가 아니면 isBalance = false;

                    if (!stack.isEmpty()) {
                        isBalance = false;
                        break;
                    }
                }
            }

            // 4. isBalance ? bw.write("YES\n") : bw.write("NO\n");
            bw.write(isBalance ? "yes\n" : "no\n");

        }

        bw.flush();
        bw.close();
    }
}