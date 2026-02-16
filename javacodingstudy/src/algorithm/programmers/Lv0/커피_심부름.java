package algorithm.programmers.Lv0;

public class 커피_심부름 {
    public static void main(String[] args) {
        /*아메리카노 4500 라떼 5000
        * */
//        String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
        String[] order = {"americanoice", "americano", "iceamericano"};

        int answer = 0;
        for (String str : order){
            if(str.contains("cafelatte")){
                answer += 5000;
            }else if(str.contains("americano") ){
                answer += 4500;
            }else{
                answer += 4500;
            }
        }

        System.out.println(answer);
    }
}
