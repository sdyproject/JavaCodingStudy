package algorithm.programmers.Lv1;

public class 최소직사각형 {

    public static void main(String[] args) {

        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

//        int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
//
//        int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};




        int maxw = 0;
        int maxh = 0;
        for (int i = 0; i < sizes.length; i++) {
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            maxw = Math.max(maxw, w);
            maxh = Math.max(maxh, h);

        }
        System.out.println(maxw * maxh);

    }
}