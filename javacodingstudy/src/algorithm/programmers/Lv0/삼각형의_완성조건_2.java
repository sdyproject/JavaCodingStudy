package algorithm.programmers.Lv0;

public class 삼각형의_완성조건_2 {

    public static void main(String[] args) {
//        int[] sides = {1, 2};
        // 출력 : 1
//        int[] sides = {3, 6};
        // 출력 : 5
        int[] sides = {11, 7};
        // 출력 : 13
        
        int answer = 0;
        for (int i = Math.abs(sides[0] - sides[1]) + 1; i < sides[0] + sides[1]; i++) {
            answer++;
        }
        System.out.println(answer);

    }
}