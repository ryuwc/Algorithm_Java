package baekjoon.Silver;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;

//public class S4_10828 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int N = Integer.parseInt(bf.readLine());
//        int[] stack = new int[N];
//        int top = -1;
//
//        for (int i = 0; i < N; i++) {
//            String[] info = bf.readLine().split(" ");
//
//            String check = info[0];
//            if (check.equals("push")) {
//                stack[++top] = Integer.parseInt(info[1]);
//            } else if (check.equals("pop")) {
//                if (top == -1) {
//                    bw.write("-1");
//                    bw.newLine();
//                } else {
//                    bw.write(String.valueOf(stack[top]));
//                    bw.newLine();
//                    top -= 1;
//                }
//            } else if (check.equals("size")) {
//                bw.write(String.valueOf(top+1));
//                bw.newLine();
//            } else if (check.equals("empty")) {
//                if (top == -1) {
//                    bw.write("1");
//                    bw.newLine();
//                } else {
//                    bw.write("0");
//                    bw.newLine();
//                }
//            } else if (check.equals("top")) {
//                if (top == -1) {
//                    bw.write("-1");
//                    bw.newLine();
//                } else {
//                    bw.write(String.valueOf(stack[top]));
//                    bw.newLine();
//                }
//            }
//        }
//        bw.close();
//    }
//}

public class S4_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        Stack<String> stack = new Stack<>();
        int top = -1;

        for (int i = 0; i < N; i++) {
            String[] info = bf.readLine().split(" ");

            String check = info[0];

            if (check.equals("push")) {
                stack.push(info[1]);
            } else if (check.equals("pop")) {
                if (stack.empty()) {
                    bw.write("-1");
                    bw.newLine();
                } else {
                    bw.write(stack.pop());
                    bw.newLine();
                }
            } else if (check.equals("size")) {
                bw.write(String.valueOf(stack.size()));
                bw.newLine();
            } else if (check.equals("empty")) {
                bw.write(stack.empty() ? "1" : "0");
                bw.newLine();
            } else if (check.equals("top")) {
                if (stack.empty()) {
                    bw.write("-1");
                    bw.newLine();
                } else {
                    bw.write(stack.get(stack.size() - 1));
                    bw.newLine();
                }
            }
        }
        bw.close();
    }
}