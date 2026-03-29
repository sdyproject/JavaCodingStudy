package algorithm.programmers.Lv1;

import java.util.ArrayList;
import java.util.Collections;

public class 문자열_내_마음대로_정렬하기 {

    public static void main(String[] args) {
//        String[] strings = {"sun", "bed", "car"};
//        int n = 1;

        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }

//        Arrays.sort(strings, (a, b) -> {
//            if (a.charAt(n) != b.charAt(n)) {
//                return a.charAt(n) - b.charAt(n);
//            }
//            return a.compareTo(b);
//
//        });
//        System.out.println(Arrays.toString(strings));
    }
}