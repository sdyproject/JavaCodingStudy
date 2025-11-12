package _250325;

import java.util.ArrayList;

public class 배열_만들기_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 4, 2, 5, 3};
		 ArrayList<Integer> stk = new ArrayList<>();
//		 System.out.println(stk.length);
		for(int i=0; i<arr.length; i++) {
			
			if(stk.size() == 0) {
				stk.add(arr[i]);
				
			}else if(stk.get(stk.size()-1)<arr[i]) {
				stk.add(arr[i]);
				System.out.println("1if"+stk );
			}else if (stk.size()-1>=arr[i]) {
				stk.remove(stk.size()-1);
				System.out.println("2if"+stk );

			}
				
		}
		System.out.println(stk);
	}

}
