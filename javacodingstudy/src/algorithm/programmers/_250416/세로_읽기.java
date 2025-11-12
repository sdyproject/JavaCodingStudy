package algorithm.programmers._250416;

import java.util.ArrayList;

public class 세로_읽기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer ="";
		
	   String my_string = "ihrhbakrfpndopljhygc";
			   int m=4; int c=2;
			  ArrayList<String> arr =  new ArrayList<>();

			   for(int i =0; i<my_string.length(); i+=m) {
				   arr.add(my_string.substring(i, i+m));
				   System.out.println(arr);
			   }
			   
			   for(int j =0; j<arr.size(); j++) {
				   answer+=arr.get(j).charAt(c-1);
			   }
		
			   System.out.println(answer);
	}

}
