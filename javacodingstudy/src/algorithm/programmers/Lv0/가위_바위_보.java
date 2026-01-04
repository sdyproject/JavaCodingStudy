package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 가위_바위_보 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String rsp = br.readLine();
		String answer = "";
		char[] arr = rsp.toCharArray();
		
		for(char c : arr) {
			if(c == '5') {
				answer+="2";
			}else if(c == '2') {
				answer+="0";
			}else{
				answer+="5";
			}
		}
		System.out.println(answer);
	}

}
