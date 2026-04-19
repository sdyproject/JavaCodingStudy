package algorithm.programmers.Lv1;

public class 유연근무제 {

    public static void main(String[] args) {
        //startday = 7일때 0, 1
        // 6 일때 1,0
        // 5 알때 1,2
        //4일때 2,3,
        // 3일때 3,4
        //2일때 4,5
        //1일때 5,6
        int[] schedules = {700, 800, 1100};
        int[][] timelogs = {{710, 2359, 1050, 700, 650, 631, 659}, {800, 801, 805, 800, 759, 810, 809}, {1105, 1001, 1002, 600, 1059, 1001, 1100}};
        int startday = 7;

//        int[] schedules = {730, 855, 700, 720};
//        int[][] timelogs = {{710, 700, 650, 735, 700, 931, 912}, {908, 901, 805, 815, 800, 831, 835},
//                {705, 701, 702, 705, 710, 710, 711}, {707, 731, 859, 913, 934, 931, 905}};
//        int startday = 1;

        int answer = schedules.length;
        for (int i = 0; i < schedules.length; i++) {
            int div = time(schedules[i]);
            for (int j = 0; j < 7; j++) {
                if (6 - startday < 0) {
                    if (j == 6) {
                        continue;
                    }
                }
                if (j == 7 - startday || j == 6 - startday) {
                    continue;
                }

                if (timelogs[i][j] > div) {
                    answer--;
                    break;
                }

            }
        }
        System.out.println(answer);


    }

    static int time(int num) {
        int hour = num / 100;
        int min = (num + 10) % 100;
        if (min >= 60) {
            min -= 60;
            hour++;
        }
        return hour * 100 + min;

    }


}
