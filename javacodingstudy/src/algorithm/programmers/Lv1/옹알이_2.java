package algorithm.programmers.Lv1;

public class 옹알이_2 {

    public static void main(String[] args) {


//        String[] babbling = {"aya", "yee", "u", "maa"};
//        String[] babbling = {"ayayeaya", "woomawooma"};

        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        int answer = 0;

        for (String s : babbling) {
            s = s.replaceAll("ayaaya|yeye|woowoo|mama", " ");
            s = s.replaceAll("aya|ye|woo|ma", "");
            if (s.isEmpty()) answer++;
        }
        System.out.println(answer);

    }

}
