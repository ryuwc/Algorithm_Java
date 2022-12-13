package baekjoon.Silver;

import java.io.*;
import java.util.*;

public class S4_9012 {
    public static StringBuilder sb = new StringBuilder();
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bf.readLine());

        for (int i = 0; i < N; i++) {
            solve(N);
        }
        System.out.println(sb);
    }

    public static void solve(int N) throws IOException {
        List<String> arr = new ArrayList<>();
        arr = List.of(bf.readLine().split(""));

        Stack<String> stack = new Stack<>();
        for (int j = 0; j < arr.size(); j++) {
            String now = arr.get(j);
            if (now.equals("(")) {
                stack.push(now);
            } else {
                if (stack.empty()) {
                    sb.append("NO");
                    sb.append("\n");
                    return;
                } else if (stack.lastElement().equals("(")) {
                    stack.pop();
                }
            }
        }
        if (stack.empty()) {
            sb.append("YES");
            sb.append("\n");
        } else {
            sb.append("NO");
            sb.append("\n");
        }
    }

}
