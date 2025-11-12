package algorithm.programmers._250513;

public class 나머지가_1이_되는_수_찾기 {

	public static void main(String[] args) {
//			int a = 10;
			int a =12;
			int min =0;
			for(int  i =1; i<=a; i++) {
				if(a%i==1) {
					min =i;
					break;
				}
				
			}
			int answer = min;
			System.out.println(answer);
	}

}
