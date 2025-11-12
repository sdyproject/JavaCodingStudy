	package algorithm.programmers._250418;
	
	import java.util.ArrayList;
	
	public class _n개_간격의_원소들 {
	
		public static void main(String[] args) {
			int[] num_list= {4, 2, 6, 1, 7, 6};
			int n =2;
	//		int n =4;
			
	    ArrayList<Integer> answer = new ArrayList<>();
	    
	    for(int i =0; i<num_list.length; i+=n) {
	    	answer.add(num_list[i]);
	    }
	        
	        
	    System.out.println(answer);
		}
	
	}
