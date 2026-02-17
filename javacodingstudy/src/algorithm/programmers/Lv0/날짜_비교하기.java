package algorithm.programmers.Lv0;

public class 날짜_비교하기 {
    public static void main(String[] args) {
            int[] date1 = {2021, 12, 28};
            int[] date2 = {2021, 12, 29};
        //출력 : 1
//            int[] date1 = {1024, 10, 24};
//            int[] date2 = {1024, 10, 24};

        //출력 : 0

//        int[] date1 = {1025, 9, 24};
//        int[] date2 = {1024, 10, 24};

        //출력 : 0
        int answer = 0;

        for (int i = 0; i < date1.length; i++) {
           if(date1[i] != date2[i]){
               if(date1[i] < date2[i]){
                   answer = 1;
                   break;
               }else{
                   answer = 0;
                   break;
               }
            }
        }



        System.out.println(answer);
    }
}
