package algorithm.programmers.Lv0;

import java.util.Arrays;

public class 최빈값_구하기 {
    //해결 x
    public static void main(String[] args) {
        int[] array = {1};
//        int[] array = {1,2,3,4,3,3};
        int answer = 0;
        int[] count = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        Arrays.sort(count);
        System.out.println(Arrays.toString(count));
        int max = 0;
        int len = 0;
        for (int i = 1; i < count.length; i++) {
            if(max < count[i]){
                max = count[i];
                answer = max;
            }
        }

    System.out.println(answer);
    }
}
