package algorithm.programmers.Lv2;

import java.util.Arrays;

public class 전화번호_목록 {

    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};

//        String[] phone_book = {"123", "456", "789"};
//
//        String[] phone_book = {"12", "123", "1235", "567", "88"};
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
        Arrays.sort(phone_book);
        String str = phone_book[0];
        for (int i = 1; i < phone_book.length; i++) {
            if (phone_book[i].startsWith(str)) {
                answer = false;
                break;
            }
        }
        System.out.println(answer);
    }
}