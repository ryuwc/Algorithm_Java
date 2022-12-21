package baekjoon.Silver;

import java.io.*;
import java.util.*;

public class S4_1920 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int[] arr1 = new int[N];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(bf.readLine());
        int[] arr2 = new int[M];

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        // binarySearch를 위해 arr1을 정렬
        Arrays.sort(arr1);

        for (int i = 0; i < M; i++) {
            int nowNum = arr2[i];
            // binarySearch를 통해 인덱스가 0이상이면 1
            if (Arrays.binarySearch(arr1, nowNum) >= 0) {
                sb.append("1");
                sb.append("\n");
            // -정수가 나온 경우 배열에 없다는 의미이므로 0
            }else {
                sb.append("0");
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
