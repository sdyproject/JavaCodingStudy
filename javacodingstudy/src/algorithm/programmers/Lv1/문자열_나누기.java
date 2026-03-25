package algorithm.programmers.Lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열_나누기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int answer = 1;
        int count = 1;
        int check = 0;
        char first = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (count == check) {
                answer++;
                first = s.charAt(i);
            }

            if (first == s.charAt(i)) {
                count++;
            } else {
                check++;
            }
        }
        System.out.println(answer);
    }
}