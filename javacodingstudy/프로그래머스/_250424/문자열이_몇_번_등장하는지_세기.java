package _250424;

public class 문자열이_몇_번_등장하는지_세기 {

	public static void main(String[] args) {
		String myString="banana"; String pat="ana";
//		String myString="aaaa"; String pat="aa";

        int answer = 0;
        
        for(int i =myString.length()-1; i>=0; i--) {
    
        	if(myString.endsWith(pat)) {
        		answer++;
        		myString= myString.substring(0, i);
        	}else {
        		myString=myString.substring(0, i);
        	}
        }
        System.out.println(answer);
        

	}

}
