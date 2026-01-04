package algorithm.programmers.Lv0;

public class A_강조하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "abstract algebra";
//		String myString = "PrOgRaMmErS";
		String answer ="";
		
		
		
		for(int i =0; i<myString.length(); i++) {
			
			if(myString.charAt(i)=='a') {
				
				answer+= Character.toUpperCase(myString.charAt(i));
			}else if(myString.charAt(i)!='A' && Character.isUpperCase(myString.charAt(i)) ) {
				answer+=  Character.toLowerCase(myString.charAt(i));
			}else {
				answer+=myString.charAt(i);
			}
							
		}
		
		
		
		//char배열로 생성후 풀이
//		char[] arr  = myString.toCharArray(); 
//		
//		for(int i =0; i<myString.length(); i++) {
//			
//			if(arr[i]=='a') {
//				
//				answer+= Character.toUpperCase(arr[i]);
//			}else {
//				answer+=  Character.toLowerCase(arr[i]);
//			}
//							
//		}
		System.out.println(answer);
	}

}
