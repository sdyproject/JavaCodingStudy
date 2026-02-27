package algorithm.programmers.Lv0;

import java.util.*;

public class 최빈값_구하기 {
    public static void main(String[] args) {
        //최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
        // 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
//        int[] array = {1};
//       int[] array = {1,2,3,4,3,3};
       int[] array = {1, 1, 2, 2};
        int answer =0;
//        내풀이
//        Map<Integer, Integer> map  = new HashMap<>();
//
//        for (int i = 0; i < array.length; i++) {
//            map.put(array[i],map.getOrDefault(array[i],0)+1 );
//        }
//        System.out.println(map);
//        int[] arr = new int[map.size()];
//        int index = 0;
//        for (Integer value : map.values()){
//            arr[index++] = value;
//        }
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        int max  = arr[arr.length-1];
//        int count = 0;
//
//        for (Integer key : map.keySet()){
//            if(max == map.get(key)){
//                answer = key;
//                count++;
//            }
//        }
//        if(count > 1){
//            answer = -1;
//        }
//        System.out.println(answer);

        //다른 풀이
        int maxCount = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1;
            System.out.println(count);
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else  if(count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }
    }
}
