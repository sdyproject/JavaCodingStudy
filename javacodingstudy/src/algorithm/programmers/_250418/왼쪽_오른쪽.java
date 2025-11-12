	package algorithm.programmers._250418;
	
	import java.util.ArrayList;
import java.util.Arrays;
	
	public class 왼쪽_오른쪽 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String[] str_list = {"u", "u", "l", "r"};
	//		String[] str_list = {"l"};
			
			// for만 활용해서 풀이 
//			ArrayList<String> answer = new ArrayList<>();
//			for(int  i=0; i<str_list.length; i++) {
//				if(str_list[i].equals("l")) {
//					for(int j =0; j<i; j++) {
//						answer.add(str_list[j]);
//						 
//					}
//					break;
//				}else if(str_list[i].equals("r")) {
//					for(int k =i+1; k<str_list.length; k++) {
//						answer.add("str_list[k]");
//					
//					}
//					break;
//				}
//			}
			
			//Arrays.copyOfRange 활용 풀이
			// Arrays.asList : Arrays.copyOfRange => String[]타입 배열 반환을 List<String> 형태로 변환
			//변환된 요소를  (addAll: 리스트의 모든 요소 add)를 활용해 ArraysList에 add 
			ArrayList<String> answer = new ArrayList<>();
			for(int  i=0; i<str_list.length; i++) {
				if(str_list[i].equals("l")) {
					answer.addAll(Arrays.asList(Arrays.copyOfRange(str_list, 0, i)));
				}else if(str_list[i].equals("r")) {
					answer.addAll(Arrays.asList(Arrays.copyOfRange(str_list, i+1, str_list.length)));
				}
			}
			System.out.println(answer);
		}
	
	}
