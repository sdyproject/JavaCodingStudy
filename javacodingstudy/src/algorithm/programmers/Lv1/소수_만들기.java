package algorithm.programmers.Lv1;

public class 소수_만들기 {

    public static void main(String[] args) {
        // 세 숫자를 합해 소수가 되는 경우의 수를 구한다.
        // 조건
        // nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
        // nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.


        int[] nums = {1, 2, 3, 4};
        // int[] nums = {1,2,7,6,4};

        int answer = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k];

                    if (check(num)) {
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }

    public static boolean check(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }

        }
        return true;
    }

}


