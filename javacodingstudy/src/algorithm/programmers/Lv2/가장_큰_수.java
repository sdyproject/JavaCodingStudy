package algorithm.programmers.Lv2;

import java.util.Arrays;

public class 가장_큰_수 {

    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        String[] arr = new String[numbers.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(arr, ((o1, o2) -> (o2 + o1).compareTo(o1 + o2)));

        if (arr[0].equals("0")) {

        }

    }
}