package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 영어가_싫어요 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numbers = br.readLine();
        String[] word = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        Map<String, Integer> map = new HashMap<>();

        long answer = 0;

        for (int i = 0; i < word.length; i++) {
            map.put(word[i],  i);
        }
        System.out.println(map);


        for (int i = 0; i < word.length; i++) {
            if(numbers.contains(word[i])){
                numbers = numbers.replace(word[i],String.valueOf(map.get(word[i])));
            }
        }
        answer = Long.parseLong(numbers);
        System.out.println(answer);


//        다른 풀이과 내 풀이 차이
//        굳이 word배열이 정렬해서 값을 넣는데 map이용해서 할 필요가 없었던거같다.
//        배열이 정렬이 안되어있었다면 사용할 방법인거 같다.
//        String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//
//        for (int i = 0; i < numbers_arr.length; i++) {
//            numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
//        }
//
//        long answer = Long.parseLong(numbers);



//        실패한 풀이
//        map 순서대로 값을 넣다보니 출력값이 달라짐
//        String str = "";
//        for (int i = 0; i < word.length; i++) {
//            if(numbers.contains(word[i])){
//                 str+=map.get(word[i]);
//            }
//        }
//        System.out.println(str);
//        answer = Long.parseLong(str);
//        System.out.println(answer);
    }
}
