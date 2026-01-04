package algorithm.programmers.Lv0;

import java.util.Scanner;

public class 문자열_겹쳐쓰기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        String my_string = sc.next();
        String overwrite_string = sc.next();
        int s =sc.nextInt();
        /* +my_string.substring(s+overwrite_string.length(),my_string.length())
        He11oWor1d.substring(2(int s)+7(overwirte.length :lloWorl) = (9),10 )
        */
 
        
       String answer = my_string.substring(0,s)+overwrite_string+my_string.substring(s+overwrite_string.length(),my_string.length());
        
        System.out.println(answer);
	}

}
