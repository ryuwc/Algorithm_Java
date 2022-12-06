package baekjoon.Silver;

import java.io.*;
import java.util.*;

public class S5_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());

        List<String> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(bf.readLine());
        }

        // List -> Set, Set -> List 형 변환하기
        Set<String> arrSet = new HashSet<String>(arr);
        List<String> arrList = new ArrayList<>(arrSet);

        arrList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return o1.compareTo(o2);
                }
            }
        });

        // 버퍼라이터 써보기
        for (String a : arrList) {
            bw.write(a);
            bw.newLine();
        }
        bw.flush();
    }
}
