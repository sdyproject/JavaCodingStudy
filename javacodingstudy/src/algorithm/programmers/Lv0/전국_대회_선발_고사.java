package algorithm.programmers.Lv0;


import java.util.Map;
import java.util.TreeMap;

public class 전국_대회_선발_고사 {

	public static void main(String[] args) {
		
		int[] rank = {3, 7, 2, 5, 4, 6, 1};
		boolean[] attendance = {false, true, true, true, true, false, false};
		
//		int[] rank = {1, 2, 3};
//		boolean[] attendance = {true, true, true};
//		
//		int[] rank = {6, 1, 5, 2, 3, 4};
//		boolean[] attendance = {true, false, true, false, false, true};
		
//		List<Integer> list = new ArrayList<>();
//		for (int i = 0; i < rank.length; i++) {
//			if(attendance[i]) {
//				list.add(rank[i]);
//			}
//		}
//		Collections.sort(list);
//		System.out.println(list);
//		
		Map<Integer, Integer> map =  new TreeMap<>();
		for (int i = 0; i < rank.length; i++) {
			if(attendance[i]) {
				map.put(rank[i], i);
			}
		}
		Integer[] data =  map.values().toArray(new Integer[0]);
		
		
		
		int answer = 10000 * data[0] + 100 * data[1] + data[2]; 
		System.out.println(answer);
		
		
	}

}
