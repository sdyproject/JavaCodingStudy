package algorithm.programmers.Lv0;

import java.util.Arrays;

public class 배열_조각하기 {

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        int[] query = {4,1,2};
        //출력 : [1,2,3]
         int[] answer = {};

        for (int i = 0; i < query.length; i++) {
            if(i % 2 == 0){
                arr = Arrays.copyOfRange(arr,0,query[i]+1);
            }else{
                arr = Arrays.copyOfRange(arr,query[i],arr.length);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}