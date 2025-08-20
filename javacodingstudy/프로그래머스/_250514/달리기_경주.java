package _250514;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 달리기_경주 {
	public static void main(String[] args) {
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		
//		첫 풀이 
//		시간 초가 실패
//		 String[] answer = new String[players.length];
//		 String next = "";
//		
//
//			 
//			
//				 for(int  i =0; i<callings.length; i++) {
//					 
//					 for(int j =1; j<players.length; j++) {
//						 if(callings[i].equals(players[j])) {
//						 
//						 next = players[j];
//						 players[j] = players[j-1];
//						 players[j-1] = next;
//						 System.out.println(next);
//					 }
//				 }
//				 }
//
//			  answer=Arrays.copyOfRange(players, 0, players.length);
//		
//		 System.out.println(Arrays.toString(answer));
		
		
		Map<String, Integer>  map = new HashMap<>();
		
		for(int  i =0; i<players.length; i++) {
			map.put(players[i], i);
		}
		System.out.println(map);
		
	}
}
