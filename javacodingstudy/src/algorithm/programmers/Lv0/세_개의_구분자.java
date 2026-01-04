package algorithm.programmers.Lv0;

import java.util.ArrayList;
import java.util.Arrays;

public class 세_개의_구분자 {

	public static void main(String[] args) {
//		String myStr= "baconlettucetomato";
		String myStr= "abcd";
//		String myStr= "cabab";
	
		 String[] arr=myStr.split("[a-c]");
		
		 System.out.println(Arrays.toString(arr));
		 
		
		 ArrayList<String> slist = new ArrayList<>();
		 
		 if(arr.length==0) {
			 slist.add("EMPTY");
		 }
		 
		 for(String str :  arr) {
			 if(!str.isEmpty()) {
				 slist.add(str);
			 }	
		 }
		 String[] answer = new String[slist.size()];
		 slist.toArray(answer);
		 System.out.println(Arrays.toString(answer));
	}

}
