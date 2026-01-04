package algorithm.programmers.Lv1;

public class 핸드폰_번호_가리기 {

	public static void main(String[] args) {
		String phone_number= "027778888";
		
		 String answer = "";
		 
	
		 for(int i=0; i<phone_number.length(); i++) {			 
			 
			 if(i>=phone_number.length()-4) {
				 answer+=String.valueOf(phone_number.charAt(i));
			 }else {
				 answer+=String.valueOf(phone_number.charAt(i)).replace(phone_number.charAt(i), '*');
			 }
		 }
		 System.out.println(answer);
	}

}
