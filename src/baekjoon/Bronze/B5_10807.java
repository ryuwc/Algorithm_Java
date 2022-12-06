package baekjoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class B5_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        String[] t = bf.readLine().split(" ");
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(t[i]);
        }

        int target = Integer.parseInt(bf.readLine());

        int rst = 0;
        for (int i = 0; i < N; i++) {
            if (nums[i] == target) rst++;
        }

        System.out.println(rst);

    }
}
