package algorithm.programmers.Lv0;

public class 특정_문자열로_끝나는_가장_긴_부분_문자열_찾기 {

	public static void main(String[] args) {
//		String myString = "AAAAaaaa";
//		String pat ="a";
		String myString = "AbCdEFG";
		String pat ="dE";
		
		
		String answer ="";
		// 기준 풀이
//		String str = "";
//		for(int i=myString.length()-1; i>=0; i--) {
//			
//			
//			if(myString.endsWith(pat)) {
//				str=myString.substring(0, i+1);
//				answer=str;
//				break;
//			}else {
//				str = myString.substring(0,myString.lastIndexOf(pat)+1);
//				if (str.endsWith(pat)) {
//	            	answer=str;
//	            }
//			}
//			
//			 str = myString.substring(0, i);
//            if (str.endsWith(pat)) {
//            	answer=str;
//            }
//			
//            
//		}
//		System.out.println(answer);
		

/// 다른 풀이
        int idx = myString.lastIndexOf(pat);
        System.out.println(idx);

        answer = myString.substring(0, idx)+pat;
        
        System.out.println(answer);
		 
	}

}
