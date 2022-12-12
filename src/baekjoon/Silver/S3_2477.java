package baekjoon.Silver;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S3_2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());

        int[][] arr = new int[6][2];
        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int max_w = 0;
        int max_h = 0;
        int max_w_idx = 0;
        int max_h_idx = 0;

        for (int i = 0; i < 6; i++) {
            if (arr[i][0] == 1 || arr[i][0] == 2) {
                if (max_w < arr[i][1]) {
                    max_w = arr[i][1];
                    max_w_idx = i;
                }
            } else if (arr[i][0] == 3 || arr[i][0] == 4) {
                if (max_h < arr[i][1]) {
                    max_h = arr[i][1];
                    max_h_idx = i;
                }
            }
        }

        int min_r = Math.abs(arr[Math.floorMod((max_w_idx - 1), 6)][1] - arr[Math.floorMod((max_w_idx + 1), 6)][1]);
        int min_c = Math.abs(arr[Math.floorMod((max_h_idx - 1), 6)][1] - arr[Math.floorMod((max_h_idx + 1), 6)][1]);

        int area = (max_w * max_h) - (min_r * min_c);

        int rst = area * N;

        bw.write(String.valueOf(rst));
        bw.close();
    }
}
