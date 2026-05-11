package algorithm.programmers.Lv2;

import java.util.Arrays;

public class H_Index {

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        int answer = 0;
        Arrays.sort(citations);
        System.out.println(Arrays.toString(citations));
        for (int i = 0; i < citations.length; i++) {
            int count = citations.length - i;

            if (count <= citations[i]) {
                answer = count;
                break;
            }
        }
        System.out.println(answer);
    }
}