package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 주사위_게임_3 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int answer = 0;
        int[] num = {a,b,c,d};
        Arrays.sort(num);

        if(num[0] == num[3]){
            answer = 1111*num[0];
        } else if(num[1] == num[3]){
            answer = (int) Math.pow(10*num[3]+num[0],2);
        } else if(num[0] == num[2]) {
            answer = (int) Math.pow(10 * num[3] + num[0], 2);
        } else if (num[0] == num[1] && num[2] == num[3]) {
            answer = (num[0]+num[2]) * Math.abs(num[0] - num[2]);
        } else if (num[0] == num[1]) {
            answer = num[2] * num[3];
        } else if (num[1] == num[2]) {
            answer = num[0] * num[3];
        } else if (num[2] == num[3]) {
            answer = num[0] * num[1];
        } else {
            answer = num[0];
        }

        System.out.println(answer);


    }
}
