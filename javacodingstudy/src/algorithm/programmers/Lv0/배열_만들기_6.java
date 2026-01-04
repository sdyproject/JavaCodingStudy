package algorithm.programmers.Lv0;

import java.util.ArrayList;

public class 배열_만들기_6 {

	public static void main(String[] args) {
//		int[] arr = {0, 1, 1, 1, 0};
//		int[] arr = {0, 1, 0, 1, 0};
		int[] arr = {0, 1, 1, 0};
      ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i<arr.length; i++) {
        	if(arr.length==0) {
        		answer.add(arr[i]);
        	}else if(arr.length!=0 && answer.size()-1==arr[i]) {
        		answer.remove(answer.size()-1);
        	}else if(arr.length!=0 && answer.size()-1!=arr[i]) {
        		answer.add(arr[i]);
        	}
        	
        	
        }
        
        if(answer.isEmpty()) {
        	answer.add(-1);
        }
        
        
        System.out.println(answer);

	}

}
