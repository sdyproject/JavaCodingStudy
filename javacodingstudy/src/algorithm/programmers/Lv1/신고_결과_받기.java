package algorithm.programmers.Lv1;

import java.util.*;

public class 신고_결과_받기 {

    public static void main(String[] args) {
        // 각 유저는 한번에 한명의 유저 신고 가능
        // 신고 횟수에 제한 없고 서로 다른 유저를 계속해서 신고 가능
        // 한 유저를 계속해서 신고할 수 있지만 동일한 유저에 대한 신고 횟수는 1회로 처리
        // k번 이상 신고된 유저 정지되고 신고한 모든 유저에게 정지 사실 메일 방송
        // 취합하여 한번에 정지시키면서 정지 메일 방송

        //	String[] id_list = {"con", "ryan"}; String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"}; int k = 3;
//        String s = str.split(" ")[0];
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        int[] answer = new int[id_list.length];
        Map<String, Integer> index = new HashMap<>();
        Map<String, HashSet<String>> mail = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            String id = id_list[i];
            index.put(id, i);
            mail.put(id, new HashSet<>());
        }
        for (int i = 0; i < report.length; i++) {
            String reporter = report[i].split(" ")[0];
            String stopId = report[i].split(" ")[1];
            mail.get(stopId).add(reporter);
        }

        for (String str : id_list) {
            Set<String> set = mail.get(str);
            if (set.size() >= k) {
                for (String name : set) {
                    answer[index.get(name)]++;
                }
            }
        }
        System.out.println(Arrays.toString(answer));

        //해결 못함 - retry필요
//        int[] answer = new int[id_list.length];
//
//        Map<String, HashSet<String>> map = new HashMap<>();
//        Map<String, Integer> count = new HashMap<>();
//
//
//
//        for(int i = 0; i < id_list.length; i++) {
//        	map.put(id_list[i], new HashSet<>());
//        	count.put(id_list[i], i);
//        }
//
//        for(String re : report) {
//        	String[] list = re.split(" ");
//        			map.get(list[1]).add(list[0]);
//        }
//
//        for(int i = 0; i<id_list.length; i ++) {
//        	HashSet<String> send = map.get(id_list[i]);
//            if (send.size() >= k) {
//
//            	for(String name : send) {
//
//            		answer[count.get(name)]++;
//            	}
//            }
//
//        }
//
//        System.out.println(Arrays.toString(answer));


    }

}
