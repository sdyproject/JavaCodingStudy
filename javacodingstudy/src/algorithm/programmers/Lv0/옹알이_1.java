package algorithm.programmers.Lv0;

import java.util.Arrays;

public class 옹알이_1 {
    public static void main(String[] args) {
//        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        //출력 : 1

        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        //출력 : 3

        int answer = 0;
        String[] use = {"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < use.length; j++) {
                if(babbling[i].contains(use[j])){
                    babbling[i] =  babbling[i].replace(use[j]," ");
                    System.out.println(Arrays.toString(babbling));

                }
            }
        }
        for (int i = 0; i < babbling.length; i++) {
            if(babbling[i].isBlank()){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
