package baekjoon.Silver;

import java.io.*;

public class S5_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        String sixsixsix = "666";
        int cnt = 0;
        int num = 666;
        while (true) {

            // 정수 문자열로 바꾸기
            String numStr = new Integer(num).toString();

            /// num은 666부터 계속 증가 그 수안에 666이 있다면 cnt +1
            if (numStr.contains(sixsixsix)) {
                cnt += 1;
            }
            // 그러다가 cnt가 N과 같아지면 출력 후 종료
            if (cnt == N) {
                System.out.println(num);
                break;
            }
            num += 1;
        }
//        String a = Integer.toString(num);
//        System.out.println(a);
    }
}
