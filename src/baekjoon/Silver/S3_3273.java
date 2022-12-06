package baekjoon.Silver;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class S3_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());

        String[] t = bf.readLine().split(" ");

        int [] tmp = new int[N];
        for (int i = 0; i < N; i++) {
            tmp[i] = Integer.parseInt(t[i]);
        }
        int target = Integer.parseInt(bf.readLine());

        Arrays.sort(tmp);

        int l = 0;
        int r = N-1;
        int rst = 0;
        while (l < r) {
            int nowsum = tmp[l] + tmp[r];
            if (nowsum < target) {
                l += 1;
            } else if (nowsum > target) {
                r -= 1;
            }
            else {
                rst += 1;
                l += 1;
                r -= 1;
            }
        }

        bw.write(String.valueOf(rst));
        bw.close();

    }
}
