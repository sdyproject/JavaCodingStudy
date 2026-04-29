package algorithm.programmers.Lv1;

import java.util.Arrays;

public class 공원 {

    public static void main(String[] args) {
        int[] mats = {5, 3, 2};
        String[][] park = {{"A", "A", "-1", "B", "B", "B", "B", "-1"},
                {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"},
                {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"},
                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}
        };
        Arrays.sort(mats);
        int count = 0;
        out:
        for (int i = mats.length - 1; i >= 0; i--) {
            for (int j = 0; j < park.length; j++) {
                for (int k = 0; k < park[0].length; k++) {
                    if (park[j][k].equals("-1") && k + mats[i] <= park[0].length && j + mats[i] <= park.length) {

                        for (int l = 1; l <= mats[i]; l++) {
                            if (!park[j + l][k].equals("-1") && !park[j][k + l].equals("-1")) {
                                break;
                            } else {
                                count++;
                                if (count == mats[i]) {
                                    break out;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);

//        Arrays.sort(mats);
//        int answer = -1;
//
//        end:
//        for (int i = mats.length - 1; i >= 0; i--) {
//            int size = mats[i];
//            for (int j = 0; j <= park.length - size; j++) {
//                for (int k = 0; k <= park[0].length - size; k++) {
//
//                    boolean count = true;
//                    out:
//                    for (int l = 0; l < size; l++) {
//                        for (int m = 0; m < size; m++) {
//                            if (!park[j + l][k + m].equals("-1")) {
//                                count = false;
//                                break out;
//                            }
//                        }
//                    }
//                    if (count) {
//                        answer = size;
//                        break end;
//                    }
//                }
//            }
//        }
//        System.out.println(answer);


    }
}