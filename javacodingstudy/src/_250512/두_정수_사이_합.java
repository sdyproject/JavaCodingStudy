package _250512;

public class 두_정수_사이_합 {

	public static void main(String[] args) {
//		int  z = 3;
//		int  y = 5;
		
//		int  z = 3;
//		int  y = 3;
		
		int  z = 5;
		int  y = 3;
		
		 long answer = 0;
		 
//		내풀이
		 if(z>y) {
			 while(z>=y) {
				 answer +=z;
				 z--;
				 
			 }
			 
		 }else if(y>z) {
			 while(z<=y) {
				 answer +=z;
				 z++;
				 
			 }
		 }else {
			 answer=z;
		 }
		System.out.println(answer);
		 
//		 다른 풀이 
//		 Math.min함수를 통해 z,y중 작은값을  예시) z=3, y=5라면 i의 초기값 3으로 설정
//		 Math.max함수를 통해 z,y중 큰값을  예시) z=3, y=5라면 5보다 작거나 같은 값까지 조건 설정 후 i 증감식
//		 for(int  i = Math.min(z, y); i<=Math.max(z, y); i++) {
//			 answer+=i;
//		 }
//		 System.out.println(answer);
	}

}
