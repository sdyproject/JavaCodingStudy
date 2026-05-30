package algorithm.codeup.스택;

import java.io.*;

public class 숫자_거꾸로_출력하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder(br.readLine());
        bw.write(sb.reverse().toString());
        bw.flush();
        br.close();
    }
}