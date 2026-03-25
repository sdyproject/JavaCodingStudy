package algorithm.programmers.Lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 둘만의_암호 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        String skip = st.nextToken();
        int index = Integer.parseInt(st.nextToken());

        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            for (int j = 0; j < index; j++) {
                ch++;
                if (ch > 'z') {
                    ch -= 26;
                }
                if (skip.contains(String.valueOf(ch))) {
                    j--;
                }
            }
            answer += ch;
        }
        System.out.println(answer);
    }

}
