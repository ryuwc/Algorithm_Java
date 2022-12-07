package baekjoon.Silver;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

public class S4_1244 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
        String[] tmp = bf.readLine().split(" ");
        int[] swi = new int[N];
        for (int i = 0; i < N; i++) {
            swi[i] = Integer.parseInt(tmp[i]);
        }
        int M = Integer.parseInt(bf.readLine());
        for (int i = 0; i < M; i++) {
            String[] info = bf.readLine().split(" ");
            if (info[0].equals("1")) {
                int manIdx = Integer.parseInt(info[1]);
                for (int j = manIdx-1; j < N; j+=manIdx) {
                    int nowSwi = swi[j];
                    if (nowSwi == 0) {
                        swi[j] = 1;
                    } else {
                        swi[j] = 0;
                    }
                }
            } else {
                int l = Integer.parseInt(info[1]) - 2;
                int r = Integer.parseInt(info[1]);
                while (true) {
                    if (l < 0 || r >= N) {
                        break;
                    }
                    if (swi[l] != swi[r]) {
                        break;
                    }
                    else {
                        l -= 1;
                        r += 1;
                    }
                }
                for (int j = l+1; j < r; j++) {
                    if (swi[j] == 1) {
                        swi[j] = 0;
                    } else {
                        swi[j] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < swi.length; i++) {
            if (i!=0 && i%20 == 0) {
                bw.newLine();
            }
            bw.write(String.valueOf(swi[i] + " "));
        }
        bw.close();
    }
}
