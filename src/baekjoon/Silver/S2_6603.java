package baekjoon.Silver;

import java.io.*;
import java.util.*;

public class S2_6603 {
    public static int [] nums;
    public static int n, r;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            n = Integer.parseInt(st.nextToken());
            if (n == 0) break;

            nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }

            comb(6, new int[6], 0);
            sb.append("\n");
        }
        System.out.println(sb);
    }
    public static void comb(int r, int[] lotto, int start) {
        if (r == 0) {
            for (int i : lotto) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < nums.length; i++) {
            lotto[lotto.length-r] = nums[i];
            comb(r-1, lotto, i+1);
        }
    }
}
