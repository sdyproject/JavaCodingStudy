package algorithm.programmers._250402;

import java.util.Arrays;

public class 문자열_바뀌서_찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	String	myString = "ABBAA";
//	String	pat = "AABB";
		String	myString = "ABAB";
		String	pat = "ABAB";
	
        int answer = 0;
	char[] arr = myString.toCharArray();
	
	for(int i = 0; i<arr.length; i++) {
		if(arr[i] =='A') {
			arr[i] ='B';
		}else {
			arr[i] ='A';
		}
		
		
	}
	
	String s = new String(arr);
	if(s.contains(pat)) {
		answer++;
	}
		
	System.out.println(answer);
	}

}
