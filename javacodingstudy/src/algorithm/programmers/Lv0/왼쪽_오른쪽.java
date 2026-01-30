	package algorithm.programmers.Lv0;
	
	import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
	
	public class 왼쪽_오른쪽 {
	
		public static void main(String[] args) {
			String[] str_list = {"u", "u", "l", "r"};
//			String[] str_list = {"l"};
//			String[] str_list = {"d", "u", "u", "r"};
			
			/*
			 * ArrayList<String> answer = new ArrayList<>();
			 */			
			/*
			 * String str = String.join("", str_list);
			 */			
			
			/*
			 * // int l1 = str.indexOf("l"); // int r1 = str.indexOf("r");
			 * 
			 * // if(l1 == 0 || r1 == str_list.length) { // answer.add(""); // }else if(l1
			 * == -1){ // // } // else if(l1 < r1) { //
			 * answer.addAll(Arrays.asList(Arrays.copyOfRange(str_list, 0, l1))); // }else {
			 * // answer.addAll(Arrays.asList(Arrays.copyOfRange(str_list, r1+1,
			 * str_list.length))); // }
			 * 
			 * // System.out.println(answer);
			 * 
			 * // for만 활용해서 풀이 // ArrayList<String> answer = new ArrayList<>(); // for(int
			 * i=0; i<str_list.length; i++) { // if(str_list[i].equals("l")) { // for(int j
			 * =0; j<i; j++) { // answer.add(str_list[j]); // // } // break; // }else
			 * if(str_list[i].equals("r")) { // for(int k =i+1; k<str_list.length; k++) { //
			 * answer.add("str_list[k]"); // // } // break; // } // }
			 */		
			
			//Arrays.copyOfRange 활용 풀이
			// Arrays.asList : Arrays.copyOfRange => String[]타입 배열 반환을 List<String> 형태로 변환
			//변환된 요소를  (addAll: 리스트의 모든 요소 add)를 활용해 ArraysList에 add 
			ArrayList<String> answer = new ArrayList<>();
			for(int  i=0; i<str_list.length; i++) {
				String str = str_list[i];
				if(str.equals("l")) {
					answer.addAll(Arrays.asList(Arrays.copyOfRange(str_list, 0, i)));
				}else if(str.equals("r")) {
					answer.addAll(Arrays.asList(Arrays.copyOfRange(str_list, i+1, str_list.length)));
				}
			}
			System.out.println(answer);
			
			
		}
	
	}
