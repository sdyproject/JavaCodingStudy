package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 특이한_정렬 {
    //다른 풀이 참고 풀이 : 실패
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] numlist = {1, 2, 3, 4, 5, 6};

//		int[] numlist = {10000,20,36,47,40,6,10,7000};

        Arrays.sort(numlist);
        for (int i = 0; i < numlist.length; i++) {
            for (int j = 0; j < numlist.length; j++) {
                if(Math.abs(numlist[i] - n) <= Math.abs(numlist[j] - n)){
                   int num =  numlist[i];
                   numlist[i] = numlist[j];
                   numlist[j] = num;
                }
            }
        }
        System.out.println(Arrays.toString(numlist));





    }

}
