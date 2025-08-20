package _250507;

public class 크기가_작은_부분문자열 {

	public static void main(String[] args) {
		String t = "3141592";
		String p = "271";
		
//		String t = "500220839878";
//		String p = "7";

//		String t = "10203";
//		String p = "15";
		
		
		
        int answer = 0;
/*첫번째 풀이
 * 문제점 p의 길이는 최대 18인데 int형 표현범위는 10자리까지 표현 가능하기 때문에 
 * long을 사용해서 풀어야함
 * */ 		
//        int b =Integer.valueOf(p);
//        int p_len = p.length();
//        for(int i =0; i<t.length()-p_len+1; i++) {
//        	 int a= Integer.valueOf(t.substring(i, p_len+i));
//        	 
//        	 if(a<=b) {
//        		 answer++;
//        	 }
//        }
        
        
        long p_long =Long.parseLong(p);
        int p_len = p.length();
        for(int i =0; i<t.length()-p_len+1; i++) {
        	 long t_long= Long.parseLong(t.substring(i, p_len+i));
        	 
        	 if(t_long<=p_long) {
        		 answer++;
        	 }
        }
        System.out.println(answer);
	}

}
