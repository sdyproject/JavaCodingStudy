package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 대문자로_바꾸기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String myString = br.readLine();
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);
            if(Character.isLowerCase(ch)){
                answer+=Character.toUpperCase(ch);
            }else{
                answer+=ch;
            }
        }
        System.out.println(answer);

        //바로 toUpperCase()해도 된다.
//         answer=myString.toUpperCase();
    }
}
