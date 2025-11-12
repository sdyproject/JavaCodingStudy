package algorithm.programmers._250621;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class 같은_숫자는_싫어 {

	public static void main(String[] args) {
//		int []arr = {1,1,3,3,0,1,1};
        int []arr = {4,4,4,3,3};
        
        //리스트 처리
//		List<Integer> list  = new ArrayList<>();
//		
//		list.add(arr[0]);
//		
//		
//		for(int i = 1; i<arr.length; i++) {
//			if( arr[i] != arr[i-1]) {
//				list.add(arr[i]);
//			}
//			
//			
//		}
//		 int[] answer=list.stream().mapToInt(i -> i).toArray();
//		 
//		 System.out.println(Arrays.toString(answer));
        
        
        //스택 처리
        Stack<Integer> st = new Stack<>();
        
        for(int num : arr) {
        	if(st.isEmpty() || !st.peek().equals(num)) {
        		st.push(num);
        		
        	}
        }
        int[] answer=st.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(answer));
		}

}
