package algorithm.programmers.Lv0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class 진료_순서_정하기 {

    public static void main(String[] args) {
        //외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
        // 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
//        int[] emergency = {3, 76, 24};
//        int[] emergency = {1, 2, 3, 4, 5, 6, 7};
        int[] emergency = {30, 10, 23, 6, 100};
        int[] answer = new int[emergency.length];
        int[] arr = emergency.clone();
        Arrays.sort(arr);
        Map<Integer,Integer> map = new HashMap<>();
        int index = 1;
        for (int i = arr.length-1; i >= 0; i--) {
            map.put(arr[i], index++ );
        }

        for (int i = 0; i < emergency.length; i++) {
            answer[i] = map.get(emergency[i]);
        }
        System.out.println(Arrays.toString(answer));

    }
}