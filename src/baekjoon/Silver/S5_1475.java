package baekjoon.Silver;

import java.io.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 백준 S5 1475 방 번호
public class S5_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String numStr = bf.readLine();
        List<String> numList = List.of(numStr.split(""));

        Integer[] saleNums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> saleNumsList = new ArrayList<>(Arrays.asList(saleNums));

        int rst = 1;
        for (int i = 0; i < numList.size(); i++) {
            int nowNum = Integer.parseInt(numList.get(i));
            if (saleNumsList.contains(nowNum)) {
                int numidx = saleNumsList.indexOf(nowNum);
                saleNumsList.set(numidx, -1);
            } else {
                if (nowNum == 6 && saleNumsList.contains(9)) {
                    int numidx = saleNumsList.indexOf(9);
                    saleNumsList.set(numidx, -1);
                } else if (nowNum == 9 && saleNumsList.contains(6)) {
                    int numidx = saleNumsList.indexOf(6);
                    saleNumsList.set(numidx, -1);
                } else {
                    rst += 1;
                    for (int j = 0; j < 10; j++) {
                        if (j == nowNum) continue;
                        saleNumsList.add(j);
                    }
                }
            }
        }

        System.out.println(rst);
    }
}
