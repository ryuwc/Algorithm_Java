package baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


// 백준 1926 그림
public class S2_1926 {
    public static int N, M;
    public static int[][] arr;
    public static int rst, cnt;
    public static int[] di = {0, 0, 1, -1};
    public static int[] dj = {1, -1, 0, 0};
    public static int[][] visit;
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
        visit = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (visit[i][j] == 0 && arr[i][j] == 1) {
                    bfs(i, j);
                    cnt += 1;
                }

            }
        }

        System.out.println(cnt);
        System.out.println(rst);

    }
    public static void bfs(int i, int j) {
        Deque<Integer> Q = new ArrayDeque<>();
        // 큐에 넣기
        Q.add(i);
        Q.add(j);
        // 방문처리
        visit[i][j] = 1;
        // 큐가 빌때까지

        int tmpRst = 1;
        while (!Q.isEmpty()) {
            int r = Q.poll();
            int c = Q.poll();
            for (int k = 0; k < 4; k++) {
                int nr = r + di[k];
                int nc = c + dj[k];
                if (nr < 0 || nr >= N || nc < 0 || nc >= M) continue;
                if (visit[nr][nc] == 0 && arr[nr][nc] == 1) {
                    tmpRst += 1;
                    Q.add(nr);
                    Q.add(nc);
                    visit[nr][nc] = 1;
                }
            }
        }
        rst = Math.max(rst, tmpRst);
    }
}
