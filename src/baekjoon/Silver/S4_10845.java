package baekjoon.Silver;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class S4_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());

        Deque<String> Q = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String[] info = bf.readLine().split(" ");
            String check = info[0];

            if (check.equals("push")) {
                Q.add(info[1]);
            } else if (check.equals("pop")) {
                bw.write(Q.isEmpty() ? "-1" : Q.removeFirst());
                bw.newLine();
            } else if (check.equals("size")) {
                bw.write(String.valueOf(Q.size()));
                bw.newLine();
            } else if (check.equals("empty")) {
                bw.write(Q.isEmpty() ? "1" : "0");
                bw.newLine();
            } else if (check.equals("front")) {
                bw.write(Q.isEmpty() ? "-1" : Q.getFirst());
                bw.newLine();
            } else {
                bw.write(Q.isEmpty() ? "-1" : Q.getLast());
                bw.newLine();
            }
        }
        bw.close();
    }
}
