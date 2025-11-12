package algorithm.programmers._250401;

public class 배열에서_문자열_대소문자_변환하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] strArr = {"AAA","BBB","CCC","DDD"};
		String[] strArr = {"aBc","AbC"};
		String[] answer = new String[strArr.length];
		for(int i = 0; i< strArr.length; i++) {
			
			if(i%2==0) {
				answer[i] = strArr[i].toLowerCase();
			}else {
				answer[i] = strArr[i].toUpperCase();
			}
			
		}
		
		System.out.println(String.join(",", answer));
	}

}
