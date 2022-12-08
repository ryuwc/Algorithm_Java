package baekjoon.Silver;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class S3_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> nList = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String tmp = bf.readLine();
            nList.add(tmp);
        }

        int cnt = 0;
        for (int i = 0; i < M; i++) {
            String tmp = bf.readLine();
            if (nList.contains(tmp)) cnt += 1;
        }

        System.out.println(cnt);
    }
}
