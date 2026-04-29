package algorithm.programmers.Lv2;

import java.util.Arrays;

public class 전화번호_목록 {

    public static void main(String[] args) {
//        String[] phone_book = {"119", "97674223", "1195524421"};

//        String[] phone_book = {"123", "456", "789"};
//
//        String[] phone_book = {"12", "123", "1235", "567", "88"};

        String[] phone_book = {"12", "56", "567"};
        boolean answer = true;
//        Map<String, Integer> map = new HashMap<>();
//        for (int i = 0; i < phone_book.length; i++) {
//            map.put(phone_book[i], i);
//
//        }
//
//        for (int i = 0; i < phone_book.length; i++) {
//            for (int j = 1; j < phone_book[i].length(); j++) {
//                String str = phone_book[i].substring(0, j);
//                if (map.containsKey(str)) {
//                    answer = false;
//                    break;
//                }
//            }
//        }
//
//
//        System.out.println(answer);


        //정렬 이용한 방식
        //기준을 phone_book[0]잡고 풀이하게 되면 phone_book[0] 접두어만 확인하게 된다.
        // 접두어 관계는 배열에 어느 위치에도 발생할 수 있는데 문제를 잘읽자.

        Arrays.sort(phone_book);
//        String str = phone_book[0];
//        for (int i = 1; i < phone_book.length; i++) {
//            if (phone_book[i].startsWith(str)) {
//                answer = false;
//                break;
//            }
//        }
//        System.out.println(answer);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }
        System.out.println(answer);
    }
}