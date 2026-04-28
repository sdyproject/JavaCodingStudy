package algorithm.programmers.Lv3;

import java.util.HashMap;
import java.util.Map;

public class 베스트앨범 {
    // 시간 내 풀이 실패
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        // 4,1,3,0
        // 장르별로 가장 많이 재생된 노래 최대 두개까지만 모음
        // 1. 속한 노래가 많이 재생된 장를  먼저 수록  > 클래식(500+150+800) 팝(2500+600) 팝 먼저 수록
        // 2. 장르 내에서 많이 재생된 노래 먼저 수록 >  4 팝 1 팝 3 클래식 0 클래식 2 클래식
        // 3. 장르 내에서  plays(재생 횟수)가 같은 노래 중에서는 고유 번호 (genres인덱스) 낮은 노래 먼저 수록

        Map<String, Integer> count = new HashMap<>();
        Map<String, Map<Integer, Integer>> song = new HashMap<>();
        

    }
}