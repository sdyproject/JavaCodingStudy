package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 소인수분해 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

            List<Integer> list = new ArrayList<>();
            for (int i = 2; i * i <= n ; i++) {
                while(n % i == 0){
                    n /= i;
                    if(!list.contains(i)){
                        list.add(i);
                    }
                }
            }

            if(n > 1){
                list.add(n);
            }

            int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(answer));
    }
}