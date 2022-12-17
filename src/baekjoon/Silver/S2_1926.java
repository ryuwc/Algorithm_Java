package baekjoon.Silver;

import java.io.*;
import java.util.*;


// 백준 1926 그림
public class S2_1926 {
    public static int N, M;
    public static int[][] arr;
    public static Set<String> visit = new HashSet<>();
    public static Deque<Integer> Q = new ArrayDeque<>();
    public static int rst, cnt;
    public static int[] di = {0, 0, 1, -1};
    public static int[] dj = {1, -1, 0, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = bf.readLine().split(" ");
        N = Integer.parseInt(nm[0]);
        M = Integer.parseInt(nm[1]);

        arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        cnt = 0;
        rst = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // i, j를 String으로 만들기
                String now = String.valueOf(i) + String.valueOf(j);
                if (!visit.contains(now) && arr[i][j] == 1) {
                    bfs(i, j);
                    cnt += 1;
                }

            }
        }

        System.out.println(cnt);
        System.out.print(rst);
    }
    public static void bfs(int i, int j) {
        // 큐에 넣기
        Q.add(i);
        Q.add(j);
        // 방문처리
        visit.add(String.valueOf(i) + String.valueOf(j));
        // 큐가 빌때까지

        int tmpRst = 1;
        while (!Q.isEmpty()) {
            int r = Q.pollFirst();
            int c = Q.pollFirst();
            for (int k = 0; k < 4; k++) {
                int nr = r + di[k];
                int nc = c + dj[k];
                if (nr < 0 || nr >= N || nc < 0 || nc >= M) continue;
                String o = String.valueOf(nr) + String.valueOf(nc);
                if (visit.contains(o)) continue;
                if (arr[nr][nc] == 0) continue;
                tmpRst += 1;
                Q.add(nr);
                Q.add(nc);
                visit.add(o);
            }
        }

        rst = Math.max(rst, tmpRst);

    }
}
