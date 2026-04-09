package algorithm.programmers.Lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자_문자열과_영단어 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        for (int i = 0; i < word.length; i++) {
            s = s.replaceAll(word[i], Integer.toString(i));
        }
        System.out.println(Integer.parseInt(s));
    }
}