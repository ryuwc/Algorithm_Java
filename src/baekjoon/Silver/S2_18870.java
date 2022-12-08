package baekjoon.Silver;

import java.io.*;
import java.util.*;

public class S2_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        List<Integer> arr = new ArrayList<>();

        String[] tmpInput = bf.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(tmpInput[i]));
        }

        Set<Integer> tmpset = new HashSet<>(arr);
        List<Integer> arrList = new ArrayList<>(tmpset);

        Collections.sort(arrList);

        List<Integer> rst = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            Integer a = Collections.binarySearch(arrList, arr.get(i));
            rst.add(a);
        }

        for (int i = 0; i < N; i++) {
            bw.write(String.valueOf(rst.get(i)) + " ");
        }
        bw.close();
    }
}
