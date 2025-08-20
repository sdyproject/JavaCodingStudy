package _250720;

public class 삼총사 {

	public static void main(String[] args) {
		
		/*학생들은 각자 정수 번호 가짐
		 * 3명의 학생의 정수 번호를 합했을때 0이 되면 삼총사
		 * 		 * */
//		int[] number = {-2, 3, 0, 2, -5};
		int[] number = {-3, -2, -1, 0, 1, 2, 3};
//		int[] number = {-1, 1, -1, 1};
		
		int answer = 0;
		
		for(int i=0; i< number.length-2; i++) {
            for(int j=i+1; j<number.length; j++) {
                for(int k=j+1; k<number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) 
                    	answer++;
                }
            }
        }
		System.out.println(answer);
	}

}
