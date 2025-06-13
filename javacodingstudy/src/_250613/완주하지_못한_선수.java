package _250613;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class 완주하지_못한_선수 {

	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion= {"stanko", "ana", "mislav"};
        String answer = "";

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for(String str : participant) {
            map.put(str, map.getOrDefault(str, 0)+1); 
            // {ana=1, mislav=2, stanko=1}
            //getOrDefault 
            // getOrDefault(찾으려는 키, 해당 키가 없을땐 반환값) +1
            // 기존 값이 있으면 가져오고, 없으면 0을 준다.
            //+1 빼고 map 출력 :{ana=0, mislav=0, stanko=0}

        }        
        System.out.println(map);
        
        
        for (String str : completion) {
            // copletion 완주한 객체의 	value -1
        	// {ana=0, mislav=1, stanko=0}
            map.put(str, map.get(str) - 1);
        }
        
        for (String str : map.keySet()) {
            // {ana=0, mislav=1, stanko=0} value값이 0보다 큰 값 answer 반환
            if (map.get(str) > 0) {
                answer = str;
                break;
            }
        }
        
        System.out.println(map);
        System.out.println(answer);
        //출력 {ana=3, mislav=2, stanko=1}

//        for(int i= 0; i<participant.length; i++) {
//            map.put(participant[i], i);
//            //getOrDefault 
//            // getOrDefault(찾으려는 키, 해당 키가 없을땐 반환값) +1
//            // 기존 값이 있으면 가져오고, 없으면 0을 준다.
//            
//
//        }        
//        System.out.println(map);
        
        
        
        
	}

}
