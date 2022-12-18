package baekjoon.Silver;

import java.io.*;
import java.util.*;

public class S1_2178 {
    static int N, M;
    static int[][] maze;
    static int[][] visited;
    public static int[] di = {0, 0, 1, -1};
    public static int[] dj = {1, -1, 0, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = bf.readLine().split(" ");
        N = Integer.parseInt(nm[0]);
        M = Integer.parseInt(nm[1]);

        maze = new int[N][M];
        visited = new int[N][M];
        for (int i = 0; i < N; i++) {
            String s = bf.readLine();
            for (int j = 0; j < M; j++) {
                maze[i][j] = s.charAt(j) -'0';
            }
        }

        bfs(0, 0);

        System.out.println(visited[N-1][M-1] + 1);
    }

    private static void bfs(int i, int j) {
        Deque<Integer> Q = new ArrayDeque<>();
        Q.add(i);
        Q.add(j);
        while (!Q.isEmpty()) {
            int r = Q.poll();
            int c = Q.poll();
            for (int k = 0; k < 4; k++) {
                int nr = r + di[k];
                int nc = c + dj[k];
                if (nr >= N || nr < 0 || nc >= M || nc < 0) continue;
                if (maze[nr][nc] == 1 && visited[nr][nc] == 0) {
                    visited[nr][nc] = visited[r][c] + 1;
                    Q.add(nr);
                    Q.add(nc);
                }
            }
        }
    }
}
