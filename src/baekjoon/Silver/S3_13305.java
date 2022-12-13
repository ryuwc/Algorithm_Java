package baekjoon.Silver;

import java.io.*;
import java.util.*;

public class S3_13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int[] city = new int[N-1];
        int[] cost = new int[N];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N-1; i++) {
            city[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }

        long rst = (long) cost[0] * city[0];

        long minCost = cost[0];
        for (int i = 1; i < N-1; i++) {
            long nowCost = cost[i];
            long nowDist = city[i];
            if (minCost > nowCost) {
                minCost = nowCost;
            }
            rst += ((long) nowDist * minCost);
        }

        System.out.println(rst);
    }
}
