package baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class S4_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(bf.readLine());

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(bf.readLine());
            if (num != 0) {
                nums.add(num);
            } else {
                nums.remove(nums.size()-1);
            }
        }

        int rst = nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println(rst);

    }
}
