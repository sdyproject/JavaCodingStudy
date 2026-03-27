package algorithm.programmers.Lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 시저_함수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                sb.append(ch);
            } else if (ch >= 'a' && ch <= 'z') {
                if (ch + n > 'z') {
                    sb.append((char) (ch + n - 26));
                } else {
                    sb.append((char) (ch + n));
                }
            } else if (ch >= 'A' && ch <= 'Z') {
                if (ch + n > 'Z') {
                    sb.append((char) (ch + n - 26));
                } else {
                    sb.append((char) (ch + n));
                }
            }
        }
        System.out.println(sb.toString());
    }

}
