package algorithm.programmers.Lv1;

public class 붕대_감기 {

    public static void main(String[] args) {
        // t초 동안 붕대를 감으면서 1초마다 x만큼의 회복
        //t초 연속으로 붕대 감기 성공시 y만큼 추가 체력 회복
        // 최대 체력보다 커지는것은 불가능

//        int[] bandage = {}; //1초간 회복량,추가 회복량 [시전 시간 , 초당 회복량, 추가 회복량] 길이 3 정수배열
//        int health = ; // 최대 체력 1 <= health <=1000
//        int[][] attacks = {{}} // 몬스터의 공격시간과 피해량 [공격시간, 피해량] 오름차순 정렬된 상태 공격시간은 모두 다름

        int[] bandage = {5, 1, 5};
        int health = 30;
        int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};

        int answer = health;
        int count = 0;
        int index = 0;
        for (int i = 1; i <= attacks[attacks.length - 1][0]; i++) {
            if (attacks[index][0] != i) {
                answer += bandage[1];
                count++;

                if (count == bandage[0]) {
                    count = 0;
                    answer += bandage[2];
                }
                if (answer > health) {
                    answer = health;
                }
            } else {
                answer -= attacks[index][1];
                count = 0;
                index++;
                if (answer <= 0) {
                    answer = -1;
                    break;
                }

            }

        }
        System.out.println(answer);
    }
}