package algorithm.programmers._250412;

public class 문자열_여러번_뒤집기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string ="rermgorpsam"; int[][] queries = {{2,3},{0,7},{5,9},{6,10}};
		
		 StringBuilder answer = new StringBuilder(my_string);
		 
		for(int i = 0; i<queries.length; i++) {
			
			int s = queries[i][0];
			int e = queries[i][1];
			
				 StringBuilder sb = new StringBuilder(answer.substring(s, e+1));
				System.out.println(sb);
				sb.reverse();
				answer.replace(s, e+1, sb.toString());
			
			
			
			}
		System.out.println(answer);
		
		
		
	}

}
