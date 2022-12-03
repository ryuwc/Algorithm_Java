package baekjoon.Silver;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class S5_2628_종이자르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String nm = bf.readLine();
        String[] nM = nm.split(" ");

        int N = Integer.parseInt(nM[1]);
        int M = Integer.parseInt(nM[0]);

//        System.out.println(N);
//        System.out.println(M);

        int line = Integer.parseInt(bf.readLine());

//        System.out.println(line);

        List<Integer> widInfo = new ArrayList<>();
        widInfo.add(0);
        widInfo.add(M);
        List<Integer> heiInfo = new ArrayList();
        heiInfo.add(0);
        heiInfo.add(N);
        for (int i = 0; i < line; i++) {
            String info = bf.readLine();
            String[] infoArr = info.split(" ");
            String c = "0";
            String d = "1";
            if (infoArr[0].equals(c)) {
                heiInfo.add(Integer.parseInt(infoArr[1]));
            } else {
                widInfo.add(Integer.parseInt(infoArr[1]));
            }
        }

        Collections.sort(widInfo);
        Collections.sort(heiInfo);

        int rst = 0;
        for (int i = 1; i < widInfo.size(); i++) {
            for (int j = 1; j < heiInfo.size(); j++) {
                int tmpWid = widInfo.get(i) - widInfo.get(i-1);
                int tmphei = heiInfo.get(j) - heiInfo.get(j-1);
                int tmprst = tmphei * tmpWid;
                if (rst < tmprst) {
                    rst = tmprst;
                }
            }
        }
        System.out.println(rst);
    }
}
