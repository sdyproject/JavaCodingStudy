package algorithm.programmers._250325;

public class 글자_이어_붙여_문자열_만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1입력
//		String my_string ="cvsgiorszzzmrpaqpe";
//		int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7}; 
		
		//2입력
		String my_string ="zpiaz";
	    int[] index_list = {1, 2, 0, 0, 3}; 
//		System.out.println(my_string.length());
		String answer = "";
		
		for(int i =0; i<index_list.length; i++) {
			System.out.println(index_list[i]);
			 answer+=my_string.charAt(index_list[i]);
		}
		System.out.println(answer);
	}

}
