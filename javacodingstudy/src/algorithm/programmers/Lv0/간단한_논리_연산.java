package algorithm.programmers.Lv0;

public class 간단한_논리_연산 {

	public static void main(String[] args) {
		// (x1 ∨ x2) ∧ (x3 ∨ x4)
//		1입출력
//		boolean x1 = true;
//		boolean x2 =false;
//		boolean x3 =false;
//		boolean x4 =false;
		
		boolean x1 = false;
		boolean x2 =true;
		boolean x3 =true;
		boolean x4 =true;
		
		  boolean answer = (x1 ||x2) && (x3 || x4);
		
		  System.out.println(answer);
	}

}
