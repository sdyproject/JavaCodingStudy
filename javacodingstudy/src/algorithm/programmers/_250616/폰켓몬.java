package algorithm.programmers._250616;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 폰켓몬 {

	public static void main(String[] args) {
//		int[] nums = {3,1,2,3};
		int[] nums = {3,3,3,2,2,2};
        int answer = 0;
        
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int num : nums) {
//        	
//        	map.put(num, map.getOrDefault(num, 0)+1);
//        	
//        }
//        System.out.println(map);
        
        Set<Integer> set = new HashSet<>();
        int count = nums.length/2;
        for(int num : nums) {
        	set.add(num);
        }
        System.out.println(set);
        
        answer = (set.size()>=count) ? count: set.size();
        
        System.out.println(answer);
	}

}
