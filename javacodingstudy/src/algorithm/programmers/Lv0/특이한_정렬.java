package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 특이한_정렬 {
    //해결못함
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] numlist = {1, 2, 3, 4, 5, 6};

//		int[] numlist = {10000,20,36,47,40,6,10,7000};

        Arrays.sort(numlist);
        int temp = 0;
        for (int i = 0; i < numlist.length; i++) {
            for (int j = 1; j < numlist.length; j++) {
                if(Math.abs(n - numlist[i]) > Math.abs(n - numlist[j])){

                }
            }
        }







    }

}
