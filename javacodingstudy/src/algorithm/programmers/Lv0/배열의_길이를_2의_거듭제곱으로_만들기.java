package algorithm.programmers.Lv0;

import java.util.Arrays;

public class 배열의_길이를_2의_거듭제곱으로_만들기 {
    //다른 풀이 참고
    public static void main(String[] args) {
//
        int[] arr = {58, 172, 746, 89};
//        int[] arr = {1, 2, 3, 4, 5, 6};

        
        int len = 1;
        while (len < arr.length) {
            len *= 2;
        }
        int[] answer = new int[len];
        System.out.println(answer.length);

        answer = Arrays.copyOf(arr, len);
        System.out.println(Arrays.toString(answer));


    }

}
