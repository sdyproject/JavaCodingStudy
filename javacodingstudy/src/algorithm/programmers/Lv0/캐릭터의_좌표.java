package algorithm.programmers.Lv0;

import java.io.IOException;
import java.util.Arrays;

public class 캐릭터의_좌표 {

    public static void main(String[] args) throws IOException {
        // [0,0]
        // up = > [0,1] down = > [0,-1]
        // left = > [-1,0] rigth = > [1,0];

//        String[] keyinput = {"left", "right", "up", "right", "right"};
//        int[] board = {11, 11};
        String[] keyinput = {"down", "down", "down", "down", "down"};
        int[] board = {7, 9};
        int[] answer = new int[board.length];

        int maxl = board[1] / 2; //세로
        int maxw = board[0] / 2; //가로

        for (int i = 0; i < keyinput.length; i++) {

            if (keyinput[i].equals("left") && answer[0] - 1 >= -maxw) {
                answer[0] -= 1;
            } else if (keyinput[i].equals("right") && answer[0] + 1 <= maxw) {
                answer[0] += 1;
            } else if (keyinput[i].equals("up") && answer[1] + 1 <= maxl) {
                answer[1] += 1;
            } else if (keyinput[i].equals("down") && answer[1] - 1 >= -maxl) {
                answer[1] -= 1;
            }

        }
        System.out.println(Arrays.toString(answer));

    }
}